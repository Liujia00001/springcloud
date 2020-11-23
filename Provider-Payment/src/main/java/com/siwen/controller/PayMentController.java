package com.siwen.controller;

import com.siwen.entity.CommonResult;
import com.siwen.entity.Payment;
import com.siwen.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
public class PayMentController {
    @Autowired
    PaymentService paymentService;
    @Value("${server.port}")
    String port;
    @PostMapping("add")
    public CommonResult addPayment(@RequestBody Payment payment) {
        if (paymentService.addPayment(payment) > 0) {
            return new CommonResult(200, "success",payment);
        }
        return new CommonResult(404, "fail");
    }

    @GetMapping("find/{id}")
    public CommonResult findByID(@PathVariable long id) {
        Payment payment=paymentService.findPaymentById(id);
        if (payment!=null) {
            return new CommonResult(2001, "success","端口号:"+port);
        }
        return new CommonResult(405, "fail");
    }


}
