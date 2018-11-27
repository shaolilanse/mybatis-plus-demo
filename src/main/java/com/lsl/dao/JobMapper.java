package com.lsl.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lsl.entity.Job;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liushaoli
 * @date 2018/11/20
 **/
public interface JobMapper extends BaseMapper<Job> {
    Job getJob(String jobCode);
}
