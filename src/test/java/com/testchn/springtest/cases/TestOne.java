package com.testchn.springtest.cases;

import com.testchn.springtest.common.util.DataSource;
import com.testchn.springtest.common.util.DatabaseUtil;
import com.testchn.springtest.entity.UserEntity;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
//@SpringBootTest
@Log4j2
public class TestOne {
//    private static Logger logger= LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @DataSource(value = "value_p", datasource = "datasource")
    @Test
    public void caseOne() throws IOException {
        SqlSession sqlSession =  DatabaseUtil.getSqlSession();
        List<UserEntity> list1 = sqlSession.selectList("select");
//        logger.info("test:" + list1);
        log.info("111111111test:" + list1);
        System.out.println("-----------------testset");
        Assert.assertEquals(1,1, "测试用例1");
        this.caseTwo();
    }
    @DataSource(value = "value_p", datasource = "datasource")
    public void caseTwo(){
        System.out.println("-----------------22222");

    }
}
