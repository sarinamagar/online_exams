package com.kjlc.app.services;

import java.util.List;
import java.util.Optional;

import com.kjlc.app.Entity.Question;
import com.kjlc.app.Entity.Test;

public interface TestService {
    Long save(Test test);
    List<Test> retrieve();
    Optional<Test> retrieve(Long id);
    void delete(Long id);

}
