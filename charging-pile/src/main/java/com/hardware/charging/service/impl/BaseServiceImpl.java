package com.hardware.charging.service.impl;

import com.github.pagehelper.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.page.PageParams;
import com.hardware.charging.mapper.base.BaseMapper;
import com.hardware.charging.service.BaseService;
import com.hardware.common.page.PageDto;
import com.hardware.common.page.PageInfo;
import com.hardware.common.utils.ModelMapperUtils;
import com.hardware.common.utils.SpringUtils;
import com.hardware.common.utils.StrUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by lp on 2020/12/16
 * @param <DO>
 */
public abstract class BaseServiceImpl<DO,M>
        implements BaseService<DO> {

    @Override
    public DO save(DO d) {
        BaseMapper<M> mapper=getMapper();
        M m= ModelMapperUtils.doToModel(d,getModelClass());
        return ModelMapperUtils.modelToDo(mapper.Save(m),getDoClass());
    }

    @Override
    public boolean update(DO d) {
        BaseMapper<M> mapper=getMapper();
        M m= ModelMapperUtils.doToModel(d,getModelClass());
        return mapper.update(m);
    }

    @Override
    public PageDto<DO> searchPage(PageInfo<DO> pageInfo) {
        BaseMapper<M> mapper=getMapper();
        PageHelper.startPage(pageInfo.getPageCount(),pageInfo.getPageSize());
        M m=ModelMapperUtils.doToModel(pageInfo.getCondition(),getModelClass());
        com.github.pagehelper.PageInfo<M> page=mapper.searchPage(m);
        List<M> result = page.getList();
        PageDto<DO> doPageDto = new PageDto<>();
        doPageDto.setPageSize(page.getPageSize());
        doPageDto.setPageIndex(page.getPageNum());
        doPageDto.setTotal(page.getTotal());
        doPageDto.setResults(ModelMapperUtils.modelToDos(result,getDoClass()));
        return doPageDto;
    }

    @Override
    public DO searchById(String id) {
        BaseMapper<M> mapper=getMapper();
        return ModelMapperUtils.modelToDo(mapper.searchById(id),getDoClass());
    }

    @Override
    public List<DO> searchByIds(List<String> ids) {
        BaseMapper<M> mapper=getMapper();
        return ModelMapperUtils.modelToDos(mapper.searchByIds(ids),getDoClass());
    }

    @Override
    public Boolean deleteById(String id) {
        BaseMapper<M> mapper=getMapper();
        return mapper.deleteById(id);
    }

    @Override
    public Boolean batchDelete(List<String> ids) {
        BaseMapper<M> mapper=getMapper();
        return mapper.batchDelete(ids);
    }

    /**
     * 获取Mapper类对象
     * @return
     */
    protected BaseMapper<M> getMapper(){
        Class<M> clazz=getModelClass();
        String entityName=clazz.getSimpleName();
        String beanName=String.format("%1$sMapper",entityName);
        return SpringUtils.get(StrUtils.toLowerCaseFirstOne(beanName));
    }

    /**
     * 获取泛型类中DO的类型
     * @return
     */
    protected Class<DO> getDoClass(){
        ParameterizedType type=(ParameterizedType)(getModelClass().getGenericSuperclass());
        Type[]types=type.getActualTypeArguments();
        return (Class<DO>)types[0];
    }

    /**
     * 获取泛型类中M的类型
     * @return
     */
    protected Class<M> getModelClass(){
        ParameterizedType type=(ParameterizedType)(getClass().getGenericSuperclass());
        Type[]types=type.getActualTypeArguments();
        return (Class<M>)types[1];
    }
}
