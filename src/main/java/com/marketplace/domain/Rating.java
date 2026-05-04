package com.marketplace.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Rating {
    private Long ratingId;
    private Long transactionId;
    private Long raterId;
    private Long rateeId;
    private Integer ratingScore;
    private String reviewText;
    private LocalDateTime createdAt;
}
