package com.marketplace.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Payment {
    private Long paymentId;
    private Long transactionId;
    private String paymentMethod;
    private String paymentStatus;
    private String stripeChargeId;
    private BigDecimal amount;
    private LocalDateTime createdAt;
}
