package com.arundeep.SpringBasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    //from properties file
    @Value("${service.url}")
    private String url;

    public String serviceURL(){
        return url;
    }
}
