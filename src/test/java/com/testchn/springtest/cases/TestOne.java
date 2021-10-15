package com.testchn.springtest.cases;

import com.testchn.springtest.controller.TestOneController;
import com.testchn.springtest.controller.UserInfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
@SpringBootTest
public class TestOne extends AbstractTestNGSpringContextTests {
    @Autowired
    UserInfoController userInfoController;
    @Autowired
    TestOneController testOneController;
    @Test
    void testSelectUserList(){
        userInfoController.list();
    }
    @Test
    void testTestIf(){

        for (int i = 0; i < 10; i++) {
            testOneController.testIf(String.valueOf(i+1));
        }

    }
    @Test
    void testTestIfAndFor(){
        testOneController.testIfAndFor("1");
        testOneController.testIfAndFor("2");
    }

    @Test
    void testSwitch(){
        // 测试switch的分支
        testOneController.testIfAndSwitch("4");
    }
}
