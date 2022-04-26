package com.it2.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy  //启动类必须使用EnableZuulProxy注解标识此工程为Zuul网关
public class ApiGatewayBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayBootstrap.class,args);
    }

}
