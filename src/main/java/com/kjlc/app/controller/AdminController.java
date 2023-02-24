package com.kjlc.app.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.kjlc.app.Entity.Question;
import com.kjlc.app.Entity.Student;
import com.kjlc.app.Entity.Test;
import com.kjlc.app.Entity.User;
import com.kjlc.app.services.QuestionService;
import com.kjlc.app.services.StudentService;
import com.kjlc.app.services.TestService;
import com.kjlc.app.services.UserService;
import com.kjlc.app.utils.Builder;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final UserService service;
    private final QuestionService questionService;
    private final TestService testService;
    private final StudentService studentService;
    
    @GetMapping("/register")
    public String getRegisterPage(){
        return("register-admin");
    }

    @PostMapping("/create")
    public String create(User user ,Model model) {
        String message;
        try{
            service.save(user);
            message = "Successfully registered";
        }
        catch(Exception e){
            e.printStackTrace();
            message = "Error registering User";
        }
        model.addAttribute("message", message);
        return ("register");
    }

    @PostMapping(value = "/test/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String createTest(@RequestPart(name = "QuestionImage") List<MultipartFile> icons,Question question, String TestName, String level){

        List <Question> questions = Builder.questionBuilder(question, icons);
        Test test = new Test();
        test.setTestName(TestName);
        test.setLevel(Integer.parseInt(level));
        Long id = testService.save(test);
        questionService.save(questions, id);
        return("home");
    }


    @PostMapping("/test/delete/{id}")
    public String createTest(@PathVariable("id") Long id){
        testService.delete(id);
        return("redirect:/admin/test/get");
    }

    // move to AdminDashController

    @PostMapping("/test/edit/{id}")
    public String editPage(@PathVariable("id") Long id, Model model){
        List<Question> questions = questionService.retrieveByTestID(id);
        model.addAttribute("questions", questions);
        model.addAttribute("test", testService.retrieve(id).get());
        return("editTest");
    }
    
    @PostMapping(value = "/test/update/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String updateTest(@RequestPart(name = "QuestionImage") List<MultipartFile> icons, @PathVariable("id") Long id, Question question){
        List <Question> questions = Builder.questionBuilder(question, icons);
        questionService.save(questions, id);
        return("testView");
    }

    @PostMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.delete(id);
        return("redirect:/admin/list/students");
    }

    //move to adminDashController
    @PostMapping("/student/edit/{id}")
    public String editSudentPage(@PathVariable("id") Long id, Model model){
        Student student = studentService.retrieve(id).get();
        String email =  service.retrieve(student.getUserID()).getEmail();
        model.addAttribute("details", student);
        model.addAttribute("email", email);
        return("editStudent");
    }

}
