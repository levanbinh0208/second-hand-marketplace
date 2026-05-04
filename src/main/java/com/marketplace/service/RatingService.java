package com.marketplace.service;

import com.marketplace.domain.Rating;
import com.marketplace.mapper.RatingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingMapper ratingMapper;

    public List<Rating> getUserRatings(Long userId) {
        return ratingMapper.findByRateeId(userId);
    }

    public void create(Rating rating) {
        ratingMapper.insert(rating);
    }
}