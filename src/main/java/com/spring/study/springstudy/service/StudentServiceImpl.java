package com.spring.study.springstudy.service;

import com.spring.study.springstudy.entities.Student;
import com.spring.study.springstudy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository repo;

    @Autowired
    public StudentServiceImpl(StudentRepository repo){
        this.repo = repo;
    }


    @Override
    public String insertStudent(String name, String major) {
        Student std = new Student(name, major);
        try{
            repo.save(std);
            return "Inserted : " + std.toString();
        } catch (Exception e){
            return "Fail to insert : " + std.toString();
        }
    }

    @Override
    public Student findByStudentName(String name) {
        return repo.findByStudentName(name);
    }
}
