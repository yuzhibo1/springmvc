package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yubo
 * @Date: 2019/7/26 下午4:48
 */

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}

