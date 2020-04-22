package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 王佳杰
 * @date 2020/4/22  16:20
 */
@Slf4j
@SpringBootApplication
@EnableFeignClients
public class FeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrder80.class,args);
    }
}
