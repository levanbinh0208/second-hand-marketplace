package com.marketplace.mapper;

import com.marketplace.domain.ListingImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ListingImageMapper {

    List<ListingImage> findByListingId(Long listingId);

    void insert(ListingImage image);

    void delete(Long imageId);

    void deleteByListingId(Long listingId);
}