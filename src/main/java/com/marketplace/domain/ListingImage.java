package com.marketplace.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ListingImage {
    private Long imageId;
    private Long listingId;
    private String imageUrl;
    private Integer displayOrder;
    private LocalDateTime uploadedAt;
}