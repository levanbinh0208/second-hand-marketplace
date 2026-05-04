package com.marketplace.mapper;

import com.marketplace.domain.Follow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FollowMapper {

    List<Follow> findFollowers(Long userId);

    List<Follow> findFollowing(Long userId);

    boolean exists(Long followerId, Long followedId);

    void insert(Follow follow);

    void delete(Long followerId, Long followedId);
}