package com.it2.controller;

import com.it2.service1.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application1Controller {

    //注入service(基于dubbo协议)
    @org.apache.dubbo.config.annotation.Reference //生成接口代理对象，通过代理对象进行远程调用
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service(){
        String result=  consumerService.service();//远程调用接口
        return "hello | "+result;
    }
}
