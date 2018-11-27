package com.lsl;

import com.lsl.dao.JobMapper;
import com.lsl.entity.Job;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Autowired
    private JobMapper jobMapper;

    @Test
    public void contextLoads() {
//        List<Job> jobList = jobMapper.selectList(null);
//        jobList.forEach(System.out::println);
        Job job = jobMapper.getJob("TESTJOB01");
        System.out.println(job);
    }


}
