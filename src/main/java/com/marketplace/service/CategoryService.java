package com.marketplace.service;

import com.marketplace.domain.Category;
import com.marketplace.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

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