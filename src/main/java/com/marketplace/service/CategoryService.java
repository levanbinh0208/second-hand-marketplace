package com.marketplace.service;

import com.marketplace.domain.Category;
import com.marketplace.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryMapper categoryMapper;

    public List<Category> getAll() {
        return categoryMapper.findAll();
    }

    public Category getById(Integer id) {
        return categoryMapper.findById(id);
    }

    public void create(Category category) {
        categoryMapper.insert(category);
    }
}