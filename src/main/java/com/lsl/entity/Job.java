package com.lsl.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 2018-04-30 18:15:45<br/>
 */
@Data
public class Job implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 职务id
     */
    private Long id;
    /**
     * 职务编码
     */
    private String jobCode;
    /**
     * 职务名称
     */
    private String name;
    /**
     * 职务序列编码
     */
    private String jobSeqCode;
    /**
     * 职务序列名称
     */
    private String jobSeqName;
    /**
     * 职务分类名称
     */
    private String jobCategoryName;
    /**
     * ps职级编码
     */
    private String psGradeCode;
    /**
     * ps职级名称
     */
    private String psGradeName;
    /**
     * 职责
     */
    private String duty;
    /**
     * 职责描述
     */
    private String dutyDescription;
    /**
     * 备注
     */
    private String remark;
    /**
     * 更新日期
     */
    private Date updateTime;
    /**
     * 创建日期
     */
    private Date createTime;
    /**
     * 0-无效 1-有效
     */
    private Integer state;

}
