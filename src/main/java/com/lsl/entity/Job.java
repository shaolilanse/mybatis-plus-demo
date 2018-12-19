package com.lsl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 职务信息表
 * </p>
 *
 * @author lsl
 * @since 2018-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 职务ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 职务编码
     */
    @TableField("jobCode")
    private String jobCode;

    /**
     * 职务名称
     */
    private String name;

    /**
     * 职务序列编码
     */
    @TableField("jobSeqCode")
    private String jobSeqCode;

    /**
     * 职务序列名称
     */
    @TableField("jobSeqName")
    private String jobSeqName;

    /**
     * 职务分类名称
     */
    @TableField("jobCategoryName")
    private String jobCategoryName;

    /**
     * ps职级编码
     */
    @TableField("psGradeCode")
    private String psGradeCode;

    /**
     * ps职级名称
     */
    @TableField("psGradeName")
    private String psGradeName;

    /**
     * 职责
     */
    private String duty;

    /**
     * 职责描述
     */
    @TableField("dutyDescription")
    private String dutyDescription;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新日期
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;

    /**
     * 创建日期
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 0-无效 1-有效
     */
    private Integer state;


}
