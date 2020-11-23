package com.siwen.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Log4j2
@RequestMapping("payment")
public class PayMentController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "zk")
    public String paymentzk() {
        return "springcloud with zookeeper:" + port + "\t" + UUID.randomUUID().toString();
    }


}
