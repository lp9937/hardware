package com.hardware.charging.wrapper;

import com.hardware.common.page.PageDto;
import com.hardware.common.page.PageInfo;

import java.util.List;

public interface BaseWrapper<I,DTO> {
    /**
     * 保存一个对象
     * @param info
     * @return
     */
    DTO save(I info);

    /**
     * 更新对象
     * @param info
     * @return
     */
    boolean update(I info);

    /**
     * 分页查询
     * @param pageInfo
     * @return
     */
    PageDto<DTO> searchPage(PageInfo<I> pageInfo);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    DTO searchById(String id);

    /**
     * 根据id集合批量查询
     * @param ids
     * @return
     */
    List<DTO> searchByIds(List<String> ids);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    Boolean deleteById(String id);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    Boolean batchDelete(List<String> ids);
}
