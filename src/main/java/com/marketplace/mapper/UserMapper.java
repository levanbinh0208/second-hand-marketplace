package com.marketplace.mapper;

import com.marketplace.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User findById(Long userId);

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAll();

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    void insert(User user);

    void update(User user);

    void delete(Long userId);
}