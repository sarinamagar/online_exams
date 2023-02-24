package com.kjlc.app.controller;

import java.util.Dictionary;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjlc.app.Entity.Question;
import com.kjlc.app.Entity.Result;
import com.kjlc.app.Entity.Student;
import com.kjlc.app.services.QuestionService;
import com.kjlc.app.services.ResultService;
import com.kjlc.app.services.StudentService;
import com.kjlc.app.services.TestService;
import com.kjlc.app.utils.Lister;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminDashController {

    private final TestService service;
    private final QuestionService questionService;
    private final StudentService studentService;
    private final ResultService resultService;
    private final TestService testService;

    @GetMapping("/home")
    public String getHome(){
        return ("redirect:/admin/list/students");
    }

    @GetMapping("/test")
    public String getTest(){
        return("createTest-copy");
    }

    @GetMapping("/test/get")
    public String getTest(Model model){
        model.addAttribute("tests",service.retrieve());
        return("testView");
    }

    @PostMapping("/test/{id}")
    public String Test(@PathVariable Long id, Model model){
        List<Question> questions = questionService.retrieveByTestID(id);
        model.addAttribute("questions",questions);
        model.addAttribute("testID", id);
        return("test");
    }
    @GetMapping("/list/students")
    public String listStudents(Model model){
        List<Student> students = studentService.retrieve();
        System.out.print(students.size());
        model.addAttribute("students", students);
        return("listStudents");
    }
    @GetMapping("/list/results")
    public String listResults(Model model){
        List<Result> resultSet = resultService.retrieve();
        List<Dictionary<String,String>> results = Lister.lister(resultSet, testService, studentService);
        model.addAttribute("results", results);
        return("listResult");
    }

    
}