package com.marketplace.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Follow {
    private Long followId;
    private Long followerId;
    private Long followedId;
    private LocalDateTime createdAt;
}