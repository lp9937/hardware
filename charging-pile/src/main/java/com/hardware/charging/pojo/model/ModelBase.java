package com.hardware.charging.pojo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ModelBase implements Serializable {
    /**
     * 主键
     */
    protected Integer id;

    /**
     * 创建时间
     */
    protected Date createDate;

    /**
     * 更新时间
     */
    protected Date updateDate;

    /**
     * 创建人
     */
    protected Integer createUserId;

    /**
     * 更新人
     */
    protected Integer updateUserId;

    /**
     * 是否删除(0：否，1：是)
     */
    protected Boolean isDelete;
}
