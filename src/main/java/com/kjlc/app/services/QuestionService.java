package com.kjlc.app.services;
import java.util.List;
import java.util.Optional;

import com.kjlc.app.Entity.Question;

public interface QuestionService {
    void save(List<Question> questions, Long id);
    Optional<Question> retrieve(Long id);
    List<Question> retrieveByTestID(Long id);

}
