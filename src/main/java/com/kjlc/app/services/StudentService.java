package com.kjlc.app.services;

import java.util.List;
import java.util.Optional;

import com.kjlc.app.Entity.Student;

public interface StudentService {
    void save(Student student);
    List<Student> retrieve();
    Optional<Student> retrieve(Long id);
    Optional<Student> retrieveByUserID(Long id);
    void delete(long id);
}
