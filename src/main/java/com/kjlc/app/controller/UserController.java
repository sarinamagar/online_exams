package com.kjlc.app.controller;

import java.util.List;

import org.hibernate.query.results.ResultBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.kjlc.app.Entity.Question;
import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Student;
import com.kjlc.app.Entity.Submission;
import com.kjlc.app.Entity.User;
import com.kjlc.app.services.QuestionService;
import com.kjlc.app.services.ResultService;
import com.kjlc.app.services.StudentService;
import com.kjlc.app.services.SubmissionService;
import com.kjlc.app.services.UserService;
import com.kjlc.app.utils.Builder;
import com.kjlc.app.utils.ResultUtils;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController{

    private final UserService service;
    private final StudentService studentService;
    private final SubmissionService submissionService;
    private final QuestionService questionService;
    private final ResultService resultService;

    @GetMapping("/register")
    public String getRegisterPage(){
        return ("register");
    }

    @PostMapping("/create")
    public String create(User user, Student student ,Model model) {
        String message;

        try{
            User u = service.save(user);
            student.setUserID(u.getUserID());
            studentService.save(student);
            message = "Successfully registered";
        }
        catch(Exception e){
            e.printStackTrace();
            message = "Error registering User";
        }
        model.addAttribute("message", message);
        
        return ("register");
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/test/submit/{testID}")
    public String submitTest(@PathVariable Long testID, @RequestBody JsonNode submission){
        List<Submission> submissions = Builder.submissionBuilder(submission, testID);
        submissionService.save(submissions);
        List<Submission> submissionCollection = submissionService.retrieveByUser(testID);
        Result result = Builder.resultBuilder(testID, submissionCollection, questionService);
        resultService.save(result);
        return ("redirect:/user/result/"+testID);
    }
    
}