package com.kjlc.app.controller;

import java.util.Dictionary;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjlc.app.Entity.Question;
import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Student;
import com.kjlc.app.Entity.Submission;
import com.kjlc.app.services.QuestionService;
import com.kjlc.app.services.ResultService;
import com.kjlc.app.services.StudentService;
import com.kjlc.app.services.SubmissionService;
import com.kjlc.app.services.TestService;
import com.kjlc.app.Entity.Test;
import com.kjlc.app.SecurityContext.Context;
import com.kjlc.app.services.UserService;
import com.kjlc.app.utils.Lister;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserDashController {

    private final TestService service;
    private final UserService userService;
    private final QuestionService questionService;
    private final TestService testService;
    private final SubmissionService submissionService;
    private final StudentService studentService;
    private final ResultService resultService;

    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("tests",service.retrieve());
        return("userHome");
    }
    
    @GetMapping("/test/get")
    public String getTest(Model model){
        model.addAttribute("tests",service.retrieve());
        return("testView");
    }

    @PostMapping("/test/{id}")
    public String Test(@PathVariable Long id, Model model){
        List<Question> questions = questionService.retrieveByTestID(id);
        Test test = testService.retrieve(id).get();
        model.addAttribute("questions",questions);
        model.addAttribute("test", test);
        return("test");
    }

    @GetMapping("/viewSubmission/{id}")
    public String viewSubmission(@PathVariable Long id, Model model){
        List<Submission> submission = submissionService.retrieve(id);
        model.addAttribute("submissions", submission);
        return("ViewSubmission");
    }

    @GetMapping("/result/{id}")
    public String result(@PathVariable Long id, Model model){
        List<Result> resultSet = resultService.retrieveByUserID(Context.getUserID());
        List<Dictionary<String,String>> results = Lister.lister(resultSet, testService, studentService);
        model.addAttribute("results", results);
        System.out.println(resultSet.size());
        return("result");
    }

    @GetMapping("/list/results")
    public String allResult(Model model){
        List<Result> resultSet = resultService.retrieveByUserID(Context.getUserID());
        List<Dictionary<String,String>> results = Lister.lister(resultSet, testService, studentService);
        model.addAttribute("results", results);
        return("result");
    }

    @GetMapping("/edit")
    public String editUserPage(Model model){
        Student student = studentService.retrieveByUserID(Context.getUserID()).get();
        String email =  userService.retrieve(student.getUserID()).getEmail();
        model.addAttribute("details", student);
        model.addAttribute("email", email);
        return("editStudent");
    }

}
