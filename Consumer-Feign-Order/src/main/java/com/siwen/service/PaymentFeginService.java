package com.siwen.service;

import com.siwen.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("payment")
public interface PaymentFeginService {
    @GetMapping("/payment/find/{id}")
    CommonResult findPaymentById(@PathVariable("id") Long id);
}
