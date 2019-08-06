package com.tano.springboot.bootdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * @author Q.W
 * @date 2019年8月7日
 */

@RestController
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Hello world!";
    }
}
