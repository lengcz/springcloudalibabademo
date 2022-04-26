package com.it2.service2.service;

import com.it2.service2.api.ProviderService;

@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    public String service() {
        return "provider invoke";
    }
}
