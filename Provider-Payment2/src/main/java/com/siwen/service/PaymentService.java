package com.siwen.service;

import com.siwen.entity.Payment;

public interface PaymentService {

    int addPayment(Payment payment);

    Payment findPaymentById(long id);
}
