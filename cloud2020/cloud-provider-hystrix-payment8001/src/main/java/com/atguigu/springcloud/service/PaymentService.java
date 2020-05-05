package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author 王佳杰
 * @date 2020/4/22  20:57
 */
@Service
public class PaymentService {

    public String paymentInfo_Ok(Integer id){
        return "线程池"+Thread.currentThread().getName()+"    paymentInfo_Ok"+id+"\t"+"成功";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutFallBack",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id){
        int timeOut = 3;
        try {
            TimeUnit.SECONDS.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"    paymentInfo_TimeOut"+id+"\t"+"成功"+"\t"+"耗费时间"+timeOut;
    }

    public String paymentInfo_TimeOutFallBack(Integer id){
        return "线程池"+Thread.currentThread().getName()+"    paymentInfo_TimeOut"+id+"\t"+"服务超时";
    }
}
