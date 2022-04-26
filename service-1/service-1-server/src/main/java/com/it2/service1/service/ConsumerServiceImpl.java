package com.it2.service1.service;

import com.it2.service1.api.ConsumerService;
import com.it2.service2.api.ProviderService;

//注解标记此类表示此方法暴露为dubbo接口
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {

    //注入service
    @org.apache.dubbo.config.annotation.Reference  //生成代理对象
    ProviderService providerService;

    //dubbo接口实现
    public String service() {
        String result=providerService.service();//远程调用接口
        return "consumer invoke | "+result;
    }
}
