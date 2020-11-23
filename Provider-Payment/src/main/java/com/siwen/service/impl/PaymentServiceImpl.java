package com.siwen.service.impl;

import com.siwen.entity.Payment;
import com.siwen.mapper.PaymentMapper;
import com.siwen.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public int addPayment(Payment payment) {
        return paymentMapper.addPayment(payment);
    }

    @Override
    public Payment findPaymentById(long id) {
        return paymentMapper.findPaymentById(id);
    }
}
