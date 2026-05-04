package com.marketplace.service;

import com.marketplace.domain.Rating;
import com.marketplace.mapper.RatingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatingService {

    private final RatingMapper ratingMapper;

    public List<Rating> getUserRatings(Long userId) {
        return ratingMapper.findByRateeId(userId);
    }

    public void create(Rating rating) {
        ratingMapper.insert(rating);
    }
}