package com.lpapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lpapi.demo.entity.LpUser;
import org.springframework.stereotype.Repository;

@Repository

public interface LpUserRepository extends JpaRepository<LpUser, Long> {
    LpUser findByUserId(Long Id);
}