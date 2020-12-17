package com.hardware.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lp on 2020/12/13
 * Pojo转换工具类
 */
public final class ModelMapperUtils {
    private ModelMapperUtils(){}
    private static final ModelMapper MODEL_MAPPER
            = SpringUtils.get(ModelMapper.class);

    /**
     * info转do
     * @param info
     * @param clazz
     * @param <I>
     * @param <DO>
     * @return
     */
    public static <I,DO> DO infoToDo(I info,Class<DO> clazz){
        return convert(info,clazz);
    }

    /**
     * do转model
     * @param d
     * @param clazz
     * @param <DO>
     * @param <M>
     * @return
     */
    public static<DO,M> M doToModel(DO d,Class<M> clazz){
        return convert(d,clazz);
    }

    /**
     * model转do
     * @param m
     * @param clazz
     * @param <M>
     * @param <DO>
     * @return
     */
    public static <M,DO> DO modelToDo(M m,Class<DO>clazz){
        return convert(m,clazz);
    }

    /**
     * do转dto
     * @param d
     * @param clazz
     * @param <DO>
     * @param <DTO>
     * @return
     */
    public static<DO,DTO> DTO doToDto(DO d,Class<DTO> clazz){
        return convert(d,clazz);
    }

    /**
     * 集合info转集合do
     * @param infos
     * @param clazz
     * @param <I>
     * @param <DO>
     * @return
     */
    public static <I,DO> List<DO> infoToDos(Collection<I> infos,Class<DO> clazz){
        return batchConvert(infos,clazz);
    }

    /**
     * 集合do转集合model
     * @param dos
     * @param clazz
     * @param <DO>
     * @param <M>
     * @return
     */
    public static<DO,M> List<M> doToModels(Collection<DO> dos,Class<M> clazz){
        return batchConvert(dos,clazz);
    }

    /**
     * 集合model转集合do
     * @param models
     * @param clazz
     * @param <M>
     * @param <DO>
     * @return
     */
    public static <M,DO> List<DO> modelToDos(Collection<M> models,Class<DO>clazz){
        return batchConvert(models,clazz);
    }

    /**
     * 集合do转集合dto
     * @param dos
     * @param clazz
     * @param <DO>
     * @param <DTO>
     * @return
     */
    public static<DO,DTO> List<DTO> doToDtos(Collection<DO> dos, Class<DTO> clazz){
        return batchConvert(dos,clazz);
    }

    /**
     * 将原对象序列化成目标对象
     * @param source
     * @param clazz
     * @param <S>
     * @param <T>
     * @return
     */
    private static <S,T> T mapper(S source,Class<T> clazz){
        AssertUtils.isNull(source);
        AssertUtils.isNull(clazz);
        return JSONObject.parseObject(JSONObject.toJSONString(source),clazz);
    }

    /**
     * 将原数据转换成目标类型的数据
     * @param source
     * @param clazz
     * @param <S>
     * @param <T>
     * @return
     */
    private static <S,T> T convert(S source,Class<T> clazz){
        AssertUtils.isNull(source);
        AssertUtils.isNull(clazz);
        return MODEL_MAPPER.map(source,clazz);
    }

    /**
     *
     * @param sources
     * @param clazz
     * @param <S>
     * @param <T>
     * @return
     */
    private static <S,T> List<T> batchConvert(Collection<S> sources,Class<T> clazz){
        if(CollectionUtils.isEmpty(sources)) {
            return Collections.emptyList();
        }
        AssertUtils.isNull(clazz);
        return sources.stream().map(it->convert(it,clazz)).collect(Collectors.toList());
    }
}
