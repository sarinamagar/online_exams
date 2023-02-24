package com.kjlc.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select * from student where userid = ?1", nativeQuery=true)
    public Optional<Student> findByUserID(Long id);
}
