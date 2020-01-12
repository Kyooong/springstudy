package com.spring.study.springstudy.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter // lombok
@ToString // lombok
public class Student {
    @Id //primary key
    @GeneratedValue // auto_increment
    private int studentId;

    @Column(length = 500) // default varchar(255), if it is a string field
    private String studentName;
    private String studentMajor;

    public Student(){}

    public Student(String studentName, String studentMajor) {
        this.studentName = studentName;
        this.studentMajor = studentMajor;
    }
}

