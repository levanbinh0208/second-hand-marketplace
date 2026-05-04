package com.marketplace.mapper;

import com.marketplace.domain.Transaction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TransactionMapper {

    Transaction findById(Long transactionId);

    List<Transaction> findByBuyerId(Long buyerId);

    List<Transaction> findBySellerId(Long sellerId);

    List<Transaction> findByStatus(String status);

    void insert(Transaction transaction);

    void update(Transaction transaction);
}