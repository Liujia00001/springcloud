package com.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication2.class, args);
    }
}
