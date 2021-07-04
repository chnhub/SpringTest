package com.testchn.springtest.common.util;

import org.apache.ibatis.session.SqlSession;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.io.IOException;


public class MyAnnotationListener implements IInvokedMethodListener, ITestListener {
    private String id;
    private String name;
    private boolean testSuccess = true;
//    private SqlSession sqlSession;
    public static SqlSession sqlSession;

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart" + result);


    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess" + result);


    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure"+ result);


    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped"+ result);


    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage" + result);


    }

    public void onStart(ITestContext context) {
        System.out.println("onStart");
        for(ITestNGMethod m1 : context.getAllTestMethods()) {
            if(m1.getConstructorOrMethod().getMethod().isAnnotationPresent(DataSource.class)) {
                name = m1.getConstructorOrMethod().getMethod().getAnnotation(DataSource.class).value();
                id = m1.getConstructorOrMethod().getMethod().getAnnotation(DataSource.class).datasource();

            }
        }

    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");


    }

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult){
        System.out.println("beforeInvocation");
        if(method.isTestMethod() && annotationPresent(method, DataSource.class) ) {
            System.out.println("beforeAnnotation...");
            System.out.println("Name: " + name + " Id: " + id);
            System.out.println(testResult.toString());
            try {
                sqlSession = DatabaseUtil.getSqlSession();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private boolean annotationPresent(IInvokedMethod method, Class<DataSource> clazz) {

        return method.getTestMethod().getConstructorOrMethod().getMethod().isAnnotationPresent(clazz) ? true : false;
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("afterInvocation");
        if(method.isTestMethod()) {
            if(method.getClass().isAnnotationPresent(DataSource.class)) {
                System.out.println("invoked afterAnnotation");
            }
            if( !testSuccess ) {
                testResult.setStatus(ITestResult.FAILURE);
            }
        }

    }

}
