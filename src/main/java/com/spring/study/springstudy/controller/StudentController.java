package com.spring.study.springstudy.controller;

import com.spring.study.springstudy.dto.Student;
import com.spring.study.springstudy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentService service;

    @Autowired
    public StudentController(StudentService service){
        this.service = service;
    }

    @RequestMapping(value="/")
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value="/test/insert")
    public String insertTest(String name, String major){
        return service.insertStudent(name, major);
    }

    @RequestMapping(value="/test/findByName")
    public Student findByStudentName(String name){
        return service.findStudentByName(name);
    }
}
