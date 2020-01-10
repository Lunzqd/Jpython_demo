package com.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;


import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author wkw
 * @since 2020-01-02
 */
@Data
@TableName("tb_order_pricecalculation")
public class TestEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增
     */
    private Long id;
    /**
     * 编码
     */
    private String code;
    
    private String text;
    /**
     * 脚本描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createdat;
    /**
     * 创建操作人
     */
    private String createdbyid;
    /**
     * 更新时间
     */
    private Date updatedat;
    /**
     * 更新操作人
     */
    private String updatedbyid;
    /**
     * 是否删除(0否1是)
     */
    private Integer deleted;
    /**
     * 删除时间
     */
    private Date deletedat;
    /**
     * 删除操作人
     */
    private String deletedbyid;
    /**
     * json
     */
    private String jsonstring;

}
