package com.kjlc.app.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.kjlc.app.Entity.Question;
import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Submission;
import com.kjlc.app.SecurityContext.Context;
import com.kjlc.app.services.QuestionService;

import org.springframework.web.multipart.MultipartFile;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Builder {
    
    public static List<Question> questionBuilder(Question question, List<MultipartFile> icons){
        List <Question> Questions = new ArrayList<>();
        String[] questions = question.getQuestionText().split(",");
        String[] A = question.getOptionA().split(",");
        String[] B = question.getOptionB().split(",");
        String[] C = question.getOptionC().split(",");
        String[] D = question.getOptionD().split(",");
        String[] Correct = question.getCorrectOption().split(",");
        for(int i = 0; i < questions.length; i++){
            Question q = new Question();
            q.setQuestionText(questions[i]);
            q.setOptionA(A[i]);
            q.setOptionB(B[i]);
            q.setOptionC(C[i]);
            q.setOptionD(D[i]);
            q.setCorrectOption(Correct[i]);
            if(icons.get(i).getSize() > 0){
                try{
                    String filename = ImageUtils.save(icons.get(i));
                    q.setImage(filename);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                

            }
            Questions.add(q);
        }
        return(Questions);
    }

    public static List<Submission> submissionBuilder(JsonNode submission, Long testID){
        List<Submission> submissions = new ArrayList<>();
        for(int i = 0; i < submission.size(); i++){
            Submission s = new Submission();
            s.setAnswer(submission.get(i).get("answer").toString().replace("\"", ""));
            s.setQuestionID(Long.parseLong(submission.get(i).get("questionID").toString()));
            s.setTestID(testID);
            s.setUserID(Context.getUserID());
            submissions.add(s);
        }
        return(submissions);
    }

    public static Result resultBuilder(Long TestID, List<Submission> submission , QuestionService questionService){

        Integer score = 0;
        for(int i = 0; i < submission.size(); i++){
            Submission s = submission.get(i);
            if(questionService.retrieve(s.getQuestionID()).isPresent()){
                //System.out.print(s.getAnswer() + "    " + questionService.retrieve(s.getQuestionID()).get().getCorrectOption() + "\n");
                try{
                    if(s.getAnswer().equals(questionService.retrieve(s.getQuestionID()).get().getCorrectOption())){
                        score ++;
                        //System.out.print("score" + score);
                    }
                }
                catch(Exception e){

                }
                
            }

        }
        Result result = new Result();
        result.setScore((int)((double) score/submission.size() * 100));
        if(result.getScore() >=40){
            result.setStatus(true);
        }
        else{
            result.setStatus(false);
        }
        System.out.println(((double) score/submission.size() * 100));
        result.setTestID(TestID);
        result.setUserID(Context.getUserID());
        System.out.println(Context.getUserID());
        return(result);
    }

    
}
