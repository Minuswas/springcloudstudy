package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author 王佳杰
 * @date 2020/4/21  11:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ComsumerzkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ComsumerzkMain80.class,args);
    }
}
