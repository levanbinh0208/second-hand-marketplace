package com.marketplace.mapper;

import com.marketplace.domain.Rating;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RatingMapper {

    Rating findById(Long ratingId);

    List<Rating> findByRateeId(Long rateeId);

    List<Rating> findByRaterId(Long raterId);

    void insert(Rating rating);

    void delete(Long ratingId);
}