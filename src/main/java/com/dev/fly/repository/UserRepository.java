package com.dev.fly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.fly.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
