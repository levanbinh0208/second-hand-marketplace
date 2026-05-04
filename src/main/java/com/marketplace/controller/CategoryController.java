package com.marketplace.controller;

import com.marketplace.domain.Category;
import com.marketplace.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    public String create(@RequestBody Category category) {
        categoryService.create(category);
        return "Created category";
    }
}