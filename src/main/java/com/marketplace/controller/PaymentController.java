package com.marketplace.controller;

import com.marketplace.domain.Payment;
import com.marketplace.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

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