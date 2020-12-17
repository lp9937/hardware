package com.hardware.charging.controller;

import com.hardware.charging.wrapper.BaseWrapper;
import com.hardware.common.api.ResponseResult;
import com.hardware.common.page.PageDto;
import com.hardware.common.page.PageInfo;
import com.hardware.common.utils.SpringUtils;
import com.hardware.common.utils.StrUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class BaseController<I,DTO> {
    /**
     * 列表查询
     * @return
     */
    @GetMapping(value = "/list")
    public ResponseResult<List<DTO>> list(){

        return ResponseResult.success();
    }

    /**
     * 保存
     * @param info
     * @return
     */
    @PostMapping("/save")
    public ResponseResult<DTO> save(@RequestBody I info){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        DTO dto=wrapper.save(info);
        return ResponseResult.success(dto);
    }

    /**
     * 更新
     * @param info
     * @return
     */
    @PutMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody I info){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        return ResponseResult.success(wrapper.update(info));
    }

    /**
     * 分页查询
     * @param pageInfo
     * @return
     */
    @GetMapping("/search-page")
    public ResponseResult<PageDto<DTO>> searchPage(@RequestBody PageInfo<I> pageInfo){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        PageDto<DTO> pageDto=wrapper.searchPage(pageInfo);
        return ResponseResult.success(pageDto);
    }

    /**
     * 主键查询
     * @param id
     * @return
     */
    @GetMapping("/search-by-id")
    public ResponseResult<DTO> searchById(@RequestParam String id){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        DTO dto=wrapper.searchById(id);
        return ResponseResult.success(dto);
    }

    /**
     * 主键列表查询
     * @param ids
     * @return
     */
    @GetMapping("/search-by-ids")
    public ResponseResult<List<DTO>> searchByIds(@RequestBody List<String> ids){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        List<DTO> dtos=wrapper.searchByIds(ids);
        return ResponseResult.success(dtos);
    }

    /**
     * 主键删除
     * @param id
     * @return
     */
    @DeleteMapping("/delete-by-id")
    public ResponseResult<Boolean> deleteById(@RequestParam String id){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        return ResponseResult.success(wrapper.deleteById(id));
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping("/batch-delete")
    public ResponseResult<Boolean> batchDelete(@RequestBody List<String> ids){
        BaseWrapper<I,DTO> wrapper=getWrapper();
        return ResponseResult.success(wrapper.batchDelete(ids));
    }

    /**
     * 获取service的增强实现
     * @return 增强实现wrapper
     */
    protected BaseWrapper<I,DTO> getWrapper(){
        Class<I> clazz=getInfoClass();
        String entityName=clazz.getSimpleName().replace("Info$", StringUtils.EMPTY);
        String beanName=String.format("%1$sWrapperImpl",entityName);
        return SpringUtils.get(StrUtils.toLowerCaseFirstOne(beanName));
    }

    /**
     * 获取泛型类中I的类型
     * @return
     */
    private Class<I> getInfoClass(){
        ParameterizedType type = (ParameterizedType)getClass().getGenericSuperclass();
        Type[] types = type.getActualTypeArguments();
        return (Class<I>)types[0];
    }
}
