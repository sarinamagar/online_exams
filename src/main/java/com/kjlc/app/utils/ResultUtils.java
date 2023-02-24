package com.kjlc.app.utils;

import java.util.List;

import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Submission;
import com.kjlc.app.SecurityContext.Context;
import com.kjlc.app.services.QuestionService;
import com.kjlc.app.services.SubmissionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ResultUtils {

    public Result resultBuilder(Long TestID, List<Submission> submission , QuestionService questionService){

        
        Integer score = 0;
        System.out.print(submission.size());
        for(int i = 0; i < submission.size(); i++){
            Submission s = submission.get(i);
            if(questionService.retrieve(s.getQuestionID()).isPresent()){
                if(s.getAnswer().equals(questionService.retrieve(s.getSubmissionID()).get().getCorrectOption())){
                    //score ++;
                }
            System.out.print(s.getAnswer());
                System.out.println(questionService.retrieve(s.getQuestionID()).get());
            }

        }
        Result result = new Result();
        result.setScore(0);
        result.setTestID(TestID);
        result.setUserID(Context.getUserID());
        return(result);
    }
}
