package com.marketplace.domain;


import lombok.Data;

@Data
public class User {

    private Long userId;


    private String username;


    private String email;


    private String passwordHash;

    private String fullName;
    private String phoneNumber;
    private String avatarUrl;
    private String bio;
    private String address;
    private String city;
    private String country;

    private Double averageRating = 0.0;
    private Integer totalReviews = 0;

    private Boolean isEmailVerified = false;
    private Boolean isPhoneVerified = false;
    private Boolean isBanned = false;
    private String banReason;

}