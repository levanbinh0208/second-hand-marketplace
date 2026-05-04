package com.marketplace.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Listing {
    private Long listingId;

    private User seller;

    private Category category;

    private String title;

    private String description;

    private BigDecimal price;

    private String condition;
    private String status = "ACTIVE";
    private String city;

    private Integer viewsCount = 0;
    private Boolean isFeatured = false;
    private LocalDateTime featuredUntil;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    private List<ListingImage> images;

    private List<Message> messages;

    private List<Transaction> transactions;

    private List<User> favoritedBy;

    public void incrementViews() {
        this.viewsCount++;
    }
}
