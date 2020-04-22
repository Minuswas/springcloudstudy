package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 王佳杰
 * @date 2020/4/22  18:24
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return orderService.getPayment(id);
    }

    @GetMapping("/consumer/payment/feign/timout")
    public String getPaymentTimeout(){
        return orderService.paymentFeignTimeout();
    }
}
