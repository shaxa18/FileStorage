package com.example.demo.service;


import org.hashids.Hashids;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanUtil {

    @Bean
    public Hashids httpHeaders(){
        return  new Hashids();
    }
}
