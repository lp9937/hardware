package com.hardware.common.page;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@Accessors(chain=false)
public class PageDto<DTO> {
    /**
     * 每页数据大小，默认值10
     */
    private int pageSize=10;
    /**
     * 当前页，默认值1
     */
    private int pageIndex=1;
    /**
     * 总记录条数
     */
    private long total;
    /**
     * 查询结果
     */
    private List<DTO> results;
}
