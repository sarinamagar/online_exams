package com.kjlc.app.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kjlc.app.Entity.User;


public interface UserRepository extends JpaRepository<User,Long> {
    
    @Query(value = "select * from user where email=?1", nativeQuery = true)
    Optional<User> findByEmail(String email);
}
