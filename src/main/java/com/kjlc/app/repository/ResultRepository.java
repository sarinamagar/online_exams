package com.kjlc.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kjlc.app.Entity.Result;

public interface ResultRepository extends JpaRepository<Result,Long>{

    @Query(value = "select * from Result where testid = ?1", nativeQuery=true)
    public List<Result> findByTestId(Long id);

    @Query(value="select * from result where userid = ?1", nativeQuery = true)
    public List<Result> findByUserID(Long id);

    @Query(value="select * from Result where userid = ?1 and testid = ?2", nativeQuery = true)
    public List<Result> findByUserID(Long id, Long testID);
}
