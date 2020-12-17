package com.hardware.charging.service;

import com.hardware.common.page.PageDto;
import com.hardware.common.page.PageInfo;

import java.util.List;

public interface BaseService<DO>{
    DO save(DO d);
    boolean update(DO d);
    PageDto<DO> searchPage(PageInfo<DO> pageInfo);
    DO searchById(String id);
    List<DO> searchByIds(List<String> ids);
    Boolean deleteById(String id);
    Boolean batchDelete(List<String> ids);
}
