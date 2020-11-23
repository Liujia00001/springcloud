package com.siwen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("payment")
public class PayMentController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "consule")
    public String paymentzk() {
        return "springcloud with consule:" + port + "\t" + UUID.randomUUID().toString();
    }


}
