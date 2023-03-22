package com.lpapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lpapi.demo.entity.LpUser;

public interface LpUserRepository extends JpaRepository<LpUser, Long> {
    LpUser findByUserId(Long userId);
}