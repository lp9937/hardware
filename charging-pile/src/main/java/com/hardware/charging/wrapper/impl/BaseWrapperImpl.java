package com.hardware.charging.wrapper.impl;

import com.hardware.charging.service.BaseService;
import com.hardware.charging.wrapper.BaseWrapper;
import com.hardware.common.page.PageDto;
import com.hardware.common.page.PageInfo;
import com.hardware.common.utils.ModelMapperUtils;
import com.hardware.common.utils.SpringUtils;
import com.hardware.common.utils.StrUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class BaseWrapperImpl<I,DTO,DO>
        implements BaseWrapper<I, DTO> {
    @Override
    public DTO save(I info) {
        DO d=ModelMapperUtils.infoToDo(info,getDoClass());
        BaseService<DO> service=getService();
        DO result=service.save(d);
        return ModelMapperUtils.doToDto(result,getDtoClass());
    }

    @Override
    public boolean update(I info) {
        DO d=ModelMapperUtils.infoToDo(info,getDoClass());
        BaseService<DO> service=getService();
        return service.update(d);
    }

    @Override
    public PageDto<DTO> searchPage(PageInfo<I> pageInfo) {
        BaseService<DO> service=getService();
        PageInfo<DO> pageCondition = getPageInfo(pageInfo);
        PageDto<DO> pageResult=service.searchPage(pageCondition);
        return getPageDto(pageResult);
    }

    @Override
    public DTO searchById(String id) {
        BaseService<DO> service=getService();
        return ModelMapperUtils.doToDto(service.searchById(id),getDtoClass());
    }

    @Override
    public List<DTO> searchByIds(List<String> ids) {
        BaseService<DO> service=getService();
        return ModelMapperUtils.doToDtos(service.searchByIds(ids),getDtoClass());
    }

    @Override
    public Boolean deleteById(String id) {
        BaseService<DO> service=getService();
        return service.deleteById(id);
    }

    @Override
    public Boolean batchDelete(List<String> ids) {
        BaseService<DO> service=getService();
        return service.batchDelete(ids);
    }

    /**
     * 获取Service实现
     * @return
     */
    protected BaseService<DO> getService(){
        Class<I> clazz=getInfoClass();
        String entityName= clazz.getSimpleName().replace("Info$", StringUtils.EMPTY);
        String beanName=String.format("%1$sServiceImpl",entityName);
        return SpringUtils.get(StrUtils.toLowerCaseFirstOne(beanName));
    }

    /**
     * 将I分页条件转换为DO分页条件
     * @param pageInfo
     * @return
     */
    protected PageInfo<DO> getPageInfo(PageInfo<I> pageInfo){
        PageInfo<DO> doPageInfo=new PageInfo<>();
        doPageInfo.setPageCount(pageInfo.getPageCount());
        doPageInfo.setPageSize(pageInfo.getPageSize());
        doPageInfo.setCondition(ModelMapperUtils.infoToDo(pageInfo.getCondition(),getDoClass()));
        return doPageInfo;
    }

    /**
     * 将DO分页结果转换为DTO分页结果
     * @param doPageDto
     * @return
     */
    protected PageDto<DTO> getPageDto(PageDto<DO> doPageDto){
        PageDto<DTO> dtoPageDto=new PageDto<>();
        dtoPageDto.setPageIndex(doPageDto.getPageIndex());
        dtoPageDto.setPageSize(doPageDto.getPageSize());
        dtoPageDto.setTotal(doPageDto.getTotal());
        dtoPageDto.setResults(ModelMapperUtils.doToDtos(doPageDto.getResults(),getDtoClass()));
        return dtoPageDto;
    }

    /**
     * 获取泛型类中I的类型
     * @return
     */
    private Class<I> getInfoClass(){
        ParameterizedType type=(ParameterizedType)getClass().getGenericSuperclass();
        Type[]types=type.getActualTypeArguments();
        return (Class<I>)types[0];
    }

    /**
     * 获取泛型类中DTO的类型
     * @return
     */
    private Class<DTO> getDtoClass(){
        ParameterizedType type=(ParameterizedType)getClass().getGenericSuperclass();
        Type[]types=type.getActualTypeArguments();
        return (Class<DTO>)types[1];
    }

    /**
     * 获取泛型类中DO的类型
     * @return
     */
    private Class<DO> getDoClass(){
        ParameterizedType type=(ParameterizedType)getClass().getGenericSuperclass();
        Type[]types=type.getActualTypeArguments();
        return (Class<DO>)types[2];
    }
}
