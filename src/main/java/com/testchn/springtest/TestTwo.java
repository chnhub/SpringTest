package com.testchn.springtest;


import com.testchn.springtest.dao.UserDao;
import com.testchn.springtest.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@ContextConfiguration(locations = {"classpath:test.xml"})
public class TestTwo extends AbstractTestNGSpringContextTests {
    @Autowired
    private UserDao dao;
    @Test
    public void case_1(){

        List<UserEntity> li =  dao.select();
        System.out.println("---------" + li);
        Assert.assertEquals(1,1);
    }
}
