package com.example.milkteacrm_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.milkteacrm_api.mapper")
public class MilkTeaCrmApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MilkTeaCrmApiApplication.class, args);
    }
}
