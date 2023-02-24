package com.kjlc.app.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kjlc.app.Entity.Result;
import com.kjlc.app.repository.ResultRepository;
import com.kjlc.app.services.ResultService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResultServiceImpl implements ResultService {
    private final ResultRepository repository;

    @Override
    public void save(Result result) {
        repository.save(result);
        System.out.println(result.getUserID());
    }

    @Override
    public List<Result> retrieve(Long testID) {
        return(repository.findByTestId(testID));
    }

    @Override
    public List<Result> retrieve() {
        List<Result> result = repository.findAll();
        return result;
    }

    @Override
    public List<Result> retrieveByUserID(Long userID) {
        List<Result> result = repository.findByUserID(userID);
        return result;
    }

    @Override
    public List<Result> retrieve(Long userID, Long testID) {
        List<Result> result = repository.findByUserID(userID, testID);
        return (result);
    }
    
}
