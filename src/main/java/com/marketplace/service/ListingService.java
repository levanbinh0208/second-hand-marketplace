package com.marketplace.service;

import com.marketplace.domain.Listing;
import com.marketplace.mapper.ListingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ListingService {

    private final ListingMapper listingMapper;

    public Listing getById(Long id) {
        return listingMapper.findById(id);
    }

    public List<Listing> getAll() {
        return listingMapper.findAll();
    }

    public List<Listing> getBySeller(Long sellerId) {
        return listingMapper.findBySellerId(sellerId);
    }

    public List<Listing> search(Integer categoryId, String title,
                                BigDecimal minPrice, BigDecimal maxPrice) {
        return listingMapper.search(categoryId, title, minPrice, maxPrice);
    }

    public void create(Listing listing) {
        listingMapper.insert(listing);
    }

    public void update(Listing listing) {
        listingMapper.update(listing);
    }

    public void delete(Long id) {
        listingMapper.delete(id);
    }
}