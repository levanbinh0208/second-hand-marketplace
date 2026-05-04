package com.marketplace.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {
    private Integer categoryId;
    private String categoryName;
    private String description;
    private String iconUrl;
    private LocalDateTime createdAt;
}
