package com.testchn.springtest.controller;

import com.testchn.springtest.model.param.UserConfigParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jacoco")
public class TestOneController {
    @GetMapping("if")
    public String testIf(@RequestParam(name = "param", defaultValue = "") String param){
        String retrunStr = "";
        String desStr = "_进入if判断param==";
        if ("1".equals(param)){
            retrunStr = param + desStr + param;
        }else if("2".equals(param)){
            retrunStr = param + desStr + param;
        }
        else if("3".equals(param)){
            retrunStr = param + desStr + param;
        }
        else if("4".equals(param)){
            retrunStr = param + desStr + param;

        }else{
            retrunStr = param + "_进入判断else";
        }

        return "输入的param为："+ param + ", 共：8个分支，" + retrunStr;
    }
    @GetMapping("ifandfor")
    public String testIfAndFor(@RequestParam(name = "param", defaultValue = "") String param){
        String retrunStr = "";
        if ("1".equals(param)){
            retrunStr = param + "_进入if判断param=="+param;
        }else{
            retrunStr = param + "_进入if判断else";

        }
        for (int i = 0; i < 10; i++) {
            retrunStr += i;
        }

        return "输入的param为："+ param + " 共：4个判断分支";
    }
    @GetMapping("twobranches")
    public String testTwoBranches(@RequestParam(name = "param", defaultValue = "") String param){
        String retrunStr = "";
        if ("1".equals(param)){
            retrunStr = param + "_进入if判断param=="+param;
        }else if("2".equals(param)){
            retrunStr = param + "_进入if判断param=="+param;
        }else{
            System.out.println("进入else");
        }
        switch (param){
            case "3":
                System.out.println(param);
            case "4":
                System.out.println(param);
            case "5":
                System.out.println(param);
        }
        return "输入的param为："+ param + " 共：5个判断分支";
    }
    @GetMapping("ifandswitch")
    public String testIfAndSwitch(@RequestParam(name = "param", defaultValue = "") String param){
        String retrunStr = "";
        if ("1".equals(param)){
            retrunStr = param + "_进入if判断param=="+param;
        }else if("2".equals(param)){
            retrunStr = param + "_进入if判断param=="+param;
        }else{
            System.out.println("进入else");
        }
        switch (param){
            case "3":
                System.out.println("进入case3:" + param);
                break;
            case "4":
                System.out.println("进入case4:" + param);
                break;
            case "5":
                System.out.println("进入case5:" + param);
                break;
            default:
                System.out.println("进入case6:" + param);
        }
        return "输入的param为："+ param + " 共：5个判断分支";
    }
}
