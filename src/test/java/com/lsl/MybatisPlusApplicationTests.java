package com.lsl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lsl.entity.Job;
import com.lsl.service.IJobService;
import com.lsl.service.IOrgEventService;
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
    private IJobService jobService;
    @Autowired
    private IOrgEventService orgEventService;

    @Test
    public void contextLoads() {
        List<Job> jobList = jobService.list(null);
        jobList.forEach(System.out::println);
//            Job job = jobMapper.getJob("TESTJOB01");
//            System.out.println(job);
         Page page = new Page(1, 10);
        IPage<Job> jobIPage = jobService.selectJobPage(page, 1);
        System.out.println(jobIPage.getTotal());

//        jobService.removeById(1221l);

    }


}
