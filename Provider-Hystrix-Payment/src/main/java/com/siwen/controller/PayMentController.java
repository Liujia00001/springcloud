package com.siwen.controller;

import com.siwen.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PayMentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable Integer id) {
        return paymentService.paymentCircuitBreaker(id);
    }

    @GetMapping("hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id) {
        return paymentService.paymentInfo_OK(id);
    }

    @GetMapping("hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable Integer id) {
        return paymentService.paymentInfo_TimeOut(id);
    }

}
