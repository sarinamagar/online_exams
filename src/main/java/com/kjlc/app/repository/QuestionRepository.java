package com.kjlc.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kjlc.app.Entity.Question;

public interface QuestionRepository extends JpaRepository<Question,Long>{
    
    @Query(value = "select * from questions where testid = ?1", nativeQuery=true)
    public List<Question> findByTestId(Long id);
}
