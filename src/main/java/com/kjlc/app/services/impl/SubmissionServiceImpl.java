package com.kjlc.app.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kjlc.app.Entity.Submission;
import com.kjlc.app.SecurityContext.Context;
import com.kjlc.app.repository.SubmissionRepository;
import com.kjlc.app.services.SubmissionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubmissionServiceImpl implements SubmissionService {
    private final SubmissionRepository repository;

    @Override
    public void save(List<Submission> submissions) {
        for(int i = 0; i <submissions.size(); i++){
            repository.save(submissions.get(i));
        }
    }

    @Override
    public List<Submission> retrieve(Long testID) {
        return(repository.findByTestId(testID));
    }

    @Override
    public List<Submission> retrieveByUser(Long testID) {
        List<Submission> result = repository.findByUser(Context.getUserID(), testID);
    
        return(result);
    }
    
}
