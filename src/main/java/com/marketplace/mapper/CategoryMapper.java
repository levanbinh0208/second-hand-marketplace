package com.marketplace.mapper;

import com.marketplace.domain.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    Category findById(Integer categoryId);

    List<Category> findAll();

    void insert(Category category);

    void update(Category category);

    void delete(Integer categoryId);
}