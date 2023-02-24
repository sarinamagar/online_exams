package com.kjlc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjlc.app.Entity.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
    
}
