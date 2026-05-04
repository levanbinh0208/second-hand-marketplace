package com.marketplace.service;

import com.marketplace.domain.Transaction;
import com.marketplace.mapper.TransactionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionMapper transactionMapper;

    public Transaction getById(Long id) {
        return transactionMapper.findById(id);
    }

    public List<Transaction> getBuyerTransactions(Long buyerId) {
        return transactionMapper.findByBuyerId(buyerId);
    }

    public List<Transaction> getSellerTransactions(Long sellerId) {
        return transactionMapper.findBySellerId(sellerId);
    }

    public void create(Transaction transaction) {
        transactionMapper.insert(transaction);
    }

    public void update(Transaction transaction) {
        transactionMapper.update(transaction);
    }
}