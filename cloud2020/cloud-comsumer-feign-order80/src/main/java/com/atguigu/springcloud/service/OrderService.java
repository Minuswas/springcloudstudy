package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 王佳杰
 * @date 2020/4/22  18:26
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE")//指定调用哪个微服务  eureka的服務名
public interface OrderService {
    @GetMapping("/payment/get/{id}")//指定調用哪個接口
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
