package com.marketplace.controller;

import com.marketplace.domain.Payment;
import com.marketplace.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{transactionId}")
    public Payment get(@PathVariable Long transactionId) {
        return paymentService.getByTransactionId(transactionId);
    }

    @PostMapping
    public String create(@RequestBody Payment payment) {
        paymentService.create(payment);
        return "Payment created";
    }
}