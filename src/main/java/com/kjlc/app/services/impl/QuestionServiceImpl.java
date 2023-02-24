package com.kjlc.app.services.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kjlc.app.Entity.Question;
import com.kjlc.app.repository.QuestionRepository;
import com.kjlc.app.services.QuestionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{
    private final QuestionRepository questionRepository;

    @Override
    public void save(List<Question> questions , Long id) {
        for(int i = 0; i < questions.size(); i++){
            Question q = new Question();
            q.setQuestionText(questions.get(i).getQuestionText());
            q.setOptionA(questions.get(i).getOptionA());
            q.setOptionB(questions.get(i).getOptionB());
            q.setOptionC(questions.get(i).getOptionC());
            q.setOptionD(questions.get(i).getOptionD());
            q.setCorrectOption(questions.get(i).getCorrectOption());
            q.setTestID(id);
            q.setImage(questions.get(i).getImage());
            questionRepository.save(q);
        }

        
    }

    @Override
    public List<Question> retrieveByTestID(Long id) {
        List <Question> result = questionRepository.findByTestId(id);
        return result;
    }

    @Override
    public Optional<Question> retrieve(Long id) {
        Optional<Question> result = questionRepository.findById(id);
        return(result);
    }

    


}
