package com.testchn.springtest;

import com.testchn.springtest.common.DataSource;
import com.testchn.springtest.common.DataSourceAop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.Test;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
        System.out.println("hello world");
        test();
    }
    @DataSource(value = "test", datasource="test2")
    public static void test(){

    }
}
