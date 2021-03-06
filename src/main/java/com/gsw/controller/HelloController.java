package com.gsw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/info")
    public String info(){
        return "Hello SpringBoot Info 开发人员";
    }
    //开发人员补充 错误发现依然是项目经理提交
    @RequestMapping("/gsw1")
    public String gsw1(){
        return "Hello gsw1";
    }
    //开发人员测试二 错误发现依然是项目经理提交
    @RequestMapping("gsw2")
    public String gsw2(){
        return "Hello gsw2";
    }
    //开发人员测试三 错误发现依然是项目经理提交
    @RequestMapping("gsw3")
    public String gsw3(){
        return "Hello gsw3";
    }
    //开发人员测试四 错误发现依然是项目经理提交
    @RequestMapping("gsw4")
    public String gsw4(){
        return "Hello gsw4";
    }
}
