package com.hardware.common.page;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = false)
public class PageInfo<I> {
    /**
     * 每页数据大小，默认值10
     */
    private int pageSize=10;
    /**
     * 当前页，默认值1
     */
    private int pageCount=1;
    /**
     * 分页查询条件
     */
    private I condition;
}
