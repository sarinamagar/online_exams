package com.kjlc.app.services.impl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kjlc.app.Entity.Test;
import com.kjlc.app.repository.TestRepository;
import com.kjlc.app.services.TestService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestRepository testRepository;
    
    @Override
    public Long save(Test test) {
        test.setTestDate(Date.valueOf(LocalDate.now()));
        testRepository.save(test);
        return(test.getTestID());
    }

    @Override
    public List<Test> retrieve() {
        List <Test> result = testRepository.findAll();
        return result;
    }

    @Override
    public Optional<Test> retrieve(Long id) {
        Optional<Test> result = testRepository.findById(id);
        return result;
    }

    @Override
    public void delete(Long id) {
        testRepository.deleteById(id);
        
    }
}
