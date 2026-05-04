package com.marketplace.controller;

import com.marketplace.domain.Favorite;
import com.marketplace.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@RequiredArgsConstructor
public class FavoriteController {

    private final FavoriteService favoriteService;

    @GetMapping("/{userId}")
    public List<Favorite> get(@PathVariable Long userId) {
        return favoriteService.getByUser(userId);
    }

    @PostMapping
    public String add(@RequestBody Favorite favorite) {
        favoriteService.add(favorite);
        return "Added favorite";
    }

    @DeleteMapping
    public String remove(@RequestParam Long userId,
                         @RequestParam Long listingId) {
        favoriteService.remove(userId, listingId);
        return "Removed favorite";
    }
}