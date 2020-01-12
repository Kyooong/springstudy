package com.spring.study.springstudy.service;

import com.spring.study.springstudy.entities.Student;

public interface StudentService {
    public String insertStudent(String name, String major);
    public Student findByStudentName(String name);
}
