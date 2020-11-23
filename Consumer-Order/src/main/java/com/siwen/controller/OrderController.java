package com.siwen.controller;

import com.siwen.entity.CommonResult;
import com.siwen.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {
    String url = "http://PAYMENT/";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable long id) {
        return restTemplate.getForObject(url+"payment/find/"+id, CommonResult.class, id);
    }

    @GetMapping("create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(url+"payment/add", payment, CommonResult.class);
    }
}
