package com.marketplace.controller;

import com.marketplace.domain.Rating;
import com.marketplace.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/{userId}")
    public List<Rating> getRatings(@PathVariable Long userId) {
        return ratingService.getUserRatings(userId);
    }

    @PostMapping
    public String create(@RequestBody Rating rating) {
        ratingService.create(rating);
        return "Rating created";
    }
}