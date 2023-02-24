package com.kjlc.app;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.kjlc.app.Entity.Student;
import com.kjlc.app.repository.StudentRepository;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
public class StudentRepositoryTest {


    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudentTest(){
        Student student = new Student();
        student.setAddress("home");
        student.setBatch("30");
        student.setContactNumber(Long.valueOf(9000000));
        student.setFirstName("John");
        student.setLastName("Cena");
        studentRepository.save(student);

        Assertions.assertThat(student.getStudentID()).isGreaterThan(0);
    }

    @Test
    public void getStudentTest(){
        Student student = new Student();
        student.setAddress("home");
        student.setBatch("30");
        student.setContactNumber(Long.valueOf(9000000));
        student.setFirstName("John");
        student.setLastName("Cena");
        studentRepository.save(student);

        Student studentC = studentRepository.findById(student.getStudentID()).get();
        Assertions.assertThat(studentC.getStudentID()).isEqualTo(1);
    }
    
    @Test
    public void deleteStudentTest(){
        Student student = new Student();
        student.setAddress("home");
        student.setBatch("30");
        student.setContactNumber(Long.valueOf(9000000));
        student.setFirstName("John");
        student.setLastName("Cena");
        studentRepository.save(student);

        Student UserC = studentRepository.findById(student.getStudentID()).get();
        studentRepository.delete(UserC);

        Optional<Student> deletedUser = studentRepository.findById(UserC.getStudentID());

        Assertions.assertThat(deletedUser.isPresent()).isEqualTo(false);
    }
}
