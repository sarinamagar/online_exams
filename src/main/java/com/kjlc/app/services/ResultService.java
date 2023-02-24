package com.kjlc.app.services;

import java.util.List;

import com.kjlc.app.Entity.Result;

public interface ResultService {
    void save(Result result);
    List<Result> retrieveByUserID(Long userID);
    List<Result> retrieve(Long testID);
    List<Result> retrieve(Long userID, Long testID);
    List<Result> retrieve();
}
