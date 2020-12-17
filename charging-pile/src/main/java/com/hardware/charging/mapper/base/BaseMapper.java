package com.hardware.charging.mapper.base;

import com.github.pagehelper.PageInfo;
import com.hardware.common.page.PageDto;

import java.util.List;

public interface BaseMapper<M> {
    M Save(M m);
    boolean update(M m);
    PageInfo<M> searchPage(M m);
    M searchById(String id);
    List<M> searchByIds(List<String> ids);
    Boolean deleteById(String id);
    Boolean batchDelete(List<String> ids);
}
