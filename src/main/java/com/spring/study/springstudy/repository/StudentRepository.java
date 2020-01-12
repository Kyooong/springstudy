package com.spring.study.springstudy.repository;

import com.spring.study.springstudy.dto.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    public Student findById(int studentId);
    public Student findByStudentName(String studentName);
}
