package com.marketplace.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {
    private Long messageId;
    private Long senderId;
    private Long receiverId;
    private Long listingId;
    private String content;
    private Boolean isRead;
    private LocalDateTime createdAt;
}
