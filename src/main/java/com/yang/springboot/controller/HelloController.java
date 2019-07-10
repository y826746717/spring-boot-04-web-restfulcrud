package com.yang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    //设置默认访问页面的第一种方法
//        return "index";
//    }

    //第二种方法写在MyMvcConfig 类中
//    @RequestMapping({"/","index.html"})
//    public String index(){
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "你好啊小可爱";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("key", "<h1>小小洋芋</h1>");
        map.put("users", Arrays.asList("张三", "李四", "王五"));
        return "success";
    }


}
