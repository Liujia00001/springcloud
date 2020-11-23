package com.siwen.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.siwen.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
//@DefaultProperties(defaultFallback = "paymentInfo_TimeOutHandler")
public class OrderController {
    @Autowired
    PaymentHystrixService paymentHystrixService;

    @GetMapping("hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id) {
        return paymentHystrixService.paymentInfo_OK(id);
    }

    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            //1.5秒钟没响应，触发降级，调用指定方法
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/
    //@HystrixCommand
    @GetMapping("hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable Integer id) {
        return paymentHystrixService.paymentInfo_TimeOut(id);
    }

    //降级方法
    public String paymentInfo_TimeOutHandler(Integer id) {
        return "异常处理信息!!!请稍后再试,/(ㄒoㄒ)/~~";
    }

}
