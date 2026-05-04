package com.marketplace.controller;

import com.marketplace.domain.Listing;
import com.marketplace.service.ListingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/listings")
@RequiredArgsConstructor
public class ListingController {

    private final ListingService listingService;

    @GetMapping
    public List<Listing> getAll() {
        return listingService.getAll();
    }

    @GetMapping("/{id}")
    public Listing getById(@PathVariable Long id) {
        return listingService.getById(id);
    }

    @GetMapping("/search")
    public List<Listing> search(
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) BigDecimal minPrice,
            @RequestParam(required = false) BigDecimal maxPrice
    ) {
        return listingService.search(categoryId, title, minPrice, maxPrice);
    }

    @PostMapping
    public String create(@RequestBody Listing listing) {
        listingService.create(listing);
        return "Created listing";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Listing listing) {
        listing.setListingId(id);
        listingService.update(listing);
        return "Updated listing";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        listingService.delete(id);
        return "Deleted listing";
    }
}