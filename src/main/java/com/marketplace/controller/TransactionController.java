package com.marketplace.controller;

import com.marketplace.domain.Transaction;
import com.marketplace.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")

public class TransactionController {
    @Autowired
    private  TransactionService transactionService;

    @GetMapping("/buyer/{buyerId}")
    public List<Transaction> buyer(@PathVariable Long buyerId) {
        return transactionService.getBuyerTransactions(buyerId);
    }

    @GetMapping("/seller/{sellerId}")
    public List<Transaction> seller(@PathVariable Long sellerId) {
        return transactionService.getSellerTransactions(sellerId);
    }

    @PostMapping
    public String create(@RequestBody Transaction transaction) {
        transactionService.create(transaction);
        return "Transaction created";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id,
                         @RequestBody Transaction transaction) {
        transaction.setTransactionId(id);
        transactionService.update(transaction);
        return "Transaction updated";
    }
}