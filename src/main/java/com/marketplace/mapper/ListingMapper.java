package com.marketplace.mapper;

import com.marketplace.domain.Listing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface ListingMapper {

    Listing findById(Long listingId);

    List<Listing> findAll();

    List<Listing> findBySellerId(Long sellerId);

    List<Listing> findByStatus(String status);

    List<Listing> findByCategoryId(Integer categoryId);

    List<Listing> findByTitle(String title);

    List<Listing> search(
            @Param("categoryId") Integer categoryId,
            @Param("title") String title,
            @Param("minPrice") BigDecimal minPrice,
            @Param("maxPrice") BigDecimal maxPrice
    );

    List<Listing> findFeatured();

    List<Listing> findRecent();

    void increaseViews(Long listingId);

    void insert(Listing listing);

    void update(Listing listing);

    void delete(Long listingId);
}