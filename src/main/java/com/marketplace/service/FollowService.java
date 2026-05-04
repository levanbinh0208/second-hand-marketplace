package com.marketplace.service;

import com.marketplace.domain.Follow;
import com.marketplace.mapper.FollowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowService {
    @Autowired
    private FollowMapper followMapper;

    public List<Follow> followers(Long userId) {
        return followMapper.findFollowers(userId);
    }

    public List<Follow> following(Long userId) {
        return followMapper.findFollowing(userId);
    }

    public void follow(Follow follow) {
        followMapper.insert(follow);
    }

    public void unfollow(Long followerId, Long followedId) {
        followMapper.delete(followerId, followedId);
    }
}