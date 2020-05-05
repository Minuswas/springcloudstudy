package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 王佳杰
 * @date 2020/5/5  12:02
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_Ok(Integer id) {
        return "PaymentFallbackService-----------------paymentInfo_Ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService-----------------paymentInfo_TimeOut";
    }
}
