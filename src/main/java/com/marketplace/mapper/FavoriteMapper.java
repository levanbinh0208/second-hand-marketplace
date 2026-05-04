package com.marketplace.mapper;

import com.marketplace.domain.Favorite;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FavoriteMapper {

    List<Favorite> findByUserId(Long userId);

    boolean exists(Long userId, Long listingId);

    void insert(Favorite favorite);

    void delete(Long userId, Long listingId);
}