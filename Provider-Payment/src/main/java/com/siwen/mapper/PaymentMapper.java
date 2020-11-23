package com.siwen.mapper;

import com.siwen.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    int addPayment(Payment payment);

    Payment findPaymentById(long id);
}
