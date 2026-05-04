package com.marketplace.controller;

import com.marketplace.domain.Follow;
import com.marketplace.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FollowController {
    @Autowired
    private FollowService followService;

    @GetMapping("/followers/{userId}")
    public List<Follow> followers(@PathVariable Long userId) {
        return followService.followers(userId);
    }

    @GetMapping("/following/{userId}")
    public List<Follow> following(@PathVariable Long userId) {
        return followService.following(userId);
    }

    @PostMapping
    public String follow(@RequestBody Follow follow) {
        followService.follow(follow);
        return "Followed";
    }

    @DeleteMapping
    public String unfollow(@RequestParam Long followerId,
                           @RequestParam Long followedId) {
        followService.unfollow(followerId, followedId);
        return "Unfollowed";
    }
}