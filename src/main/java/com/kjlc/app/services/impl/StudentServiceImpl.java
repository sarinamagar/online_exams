package com.kjlc.app.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kjlc.app.Entity.Student;
import com.kjlc.app.repository.StudentRepository;
import com.kjlc.app.services.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    @Override
    public void save(Student student) {
        Student s;
        if(repository.findByUserID(student.getUserID()).isPresent()){
            s = repository.findByUserID(student.getUserID()).get();
        }
        else{
            s = new Student();
        }
        s.setAddress(student.getAddress());
        s.setBatch(student.getBatch());
        s.setContactNumber(student.getContactNumber());
        s.setFirstName(student.getFirstName());
        s.setLastName(student.getLastName());
        s.setDOB(student.getDOB());
        s.setLevel(student.getLevel());
        repository.save(s);
    }
    @Override
    public List<Student> retrieve() {
        return(repository.findAll());
    }
    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }
    @Override
    public Optional<Student> retrieve(Long id) {
        Optional<Student> result = repository.findById(id);
        return (result);
    }
    @Override
    public Optional<Student> retrieveByUserID(Long id) {
        Optional<Student> result = repository.findByUserID(id);
        return (result);
    }
    
}
