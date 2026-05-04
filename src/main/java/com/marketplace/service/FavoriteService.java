package com.marketplace.service;

import com.marketplace.domain.Favorite;
import com.marketplace.mapper.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    @Autowired
    private FavoriteMapper favoriteMapper;

    public List<Favorite> getByUser(Long userId) {
        return favoriteMapper.findByUserId(userId);
    }

    public void add(Favorite favorite) {
        favoriteMapper.insert(favorite);
    }

    public void remove(Long userId, Long listingId) {
        favoriteMapper.delete(userId, listingId);
    }
}