package com.marketplace.mapper;

import com.marketplace.domain.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {

    Payment findById(Long paymentId);

    Payment findByTransactionId(Long transactionId);

    List<Payment> findAll();

    void insert(Payment payment);

    void update(Payment payment);
}