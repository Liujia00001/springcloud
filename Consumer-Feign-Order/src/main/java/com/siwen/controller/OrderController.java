package com.siwen.controller;

import com.siwen.service.PaymentFeginService;
import com.siwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    PaymentFeginService paymentFeginService;

    @GetMapping("{id}")
    public CommonResult  getPaymentById(@PathVariable("id") Long id) {
        return paymentFeginService.findPaymentById(id);
    }


}
