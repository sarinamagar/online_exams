package com.kjlc.app;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.kjlc.app.Entity.Question;
import com.kjlc.app.repository.QuestionRepository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
public class QuestionRepoTest {
    
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    public void saveQuestionsTest(){
        Question question = new Question();
        question.setQuestionText("Question");
        question.setOptionA("A");
        question.setOptionB("B");
        question.setOptionC("C");
        question.setOptionD("D");
        question.setCorrectOption("A");
        questionRepository.save(question);

        Assertions.assertThat(question.getQuestionID()).isGreaterThan(0);
    }

    @Test
    public void getQuestionsTest(){


        Question question = new Question();
        question.setQuestionText("Question");
        question.setOptionA("A");
        question.setOptionB("B");
        question.setOptionC("C");
        question.setOptionD("D");
        question.setCorrectOption("A");
        questionRepository.save(question);

        Question questionC = questionRepository.findById(question.getQuestionID()).get();
        Assertions.assertThat(questionC.getQuestionID()).isEqualTo(1);

    }

    

}
