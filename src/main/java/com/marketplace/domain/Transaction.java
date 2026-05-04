package com.marketplace.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Transaction {
    private Long transactionId;


    private Long listingId;
    private Long buyerId;
    private Long sellerId;

    private BigDecimal amount;
    private BigDecimal platformFee;
    private BigDecimal sellerAmount;

    private String status;
    private String deliveryStatus;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime completedAt;

    private Payment payment;

    private Rating rating;
}
