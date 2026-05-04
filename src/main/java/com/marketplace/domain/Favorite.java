package com.marketplace.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Favorite {
    private Long favoriteId;
    private Long userId;
    private Long listingId;
    private LocalDateTime createdAt;
}