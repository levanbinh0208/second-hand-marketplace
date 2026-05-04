package com.marketplace.service;

import com.marketplace.domain.Payment;
import com.marketplace.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    public Payment getByTransactionId(Long transactionId) {
        return paymentMapper.findByTransactionId(transactionId);
    }

    public void create(Payment payment) {
        paymentMapper.insert(payment);
    }

    public void update(Payment payment) {
        paymentMapper.update(payment);
    }
}