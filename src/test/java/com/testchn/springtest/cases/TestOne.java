package com.testchn.springtest.cases;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class TestOne {

    @Test
    public void caseOne(){
        Assert.assertEquals(1,1, "测试用例1");

    }
}
