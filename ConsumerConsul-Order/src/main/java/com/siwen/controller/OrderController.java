package com.siwen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {
    String url = "http://payment/";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("consule")
    public String payment() {
        String result = restTemplate.getForObject(url + "payment/consule", String.class);
        return result;
    }
}
