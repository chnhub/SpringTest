package com.testchn.springtest.cases;

import com.testchn.springtest.SpringTestApplication;
import com.testchn.springtest.controller.TestOneController;
import com.testchn.springtest.controller.UserInfoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
public class TestOne {
    @Autowired
    UserInfoController userInfoController;
    @Autowired
    TestOneController testOneController;
    @Test
    public void testSelectUserList(){
        userInfoController.list();
    }
    @Test
    public void testTestIf(){

        for (int i = 0; i < 10; i++) {
            testOneController.testIf(String.valueOf(i+1));
        }

    }
    @Test
    public void testTestIfAndFor(){
        testOneController.testIfAndFor("1");
        testOneController.testIfAndFor("2");
    }

    @Test
    public void testSwitch(){
        // 测试switch的分支 1
        testOneController.testIfAndSwitch("4");
    }
}
