package com.marketplace.service;

import com.marketplace.domain.Follow;
import com.marketplace.mapper.FollowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FollowService {

    private final FollowMapper followMapper;

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