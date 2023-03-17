package com.example.service;

import com.example.dao.entity.Student;

/**
 * 学生业务逻辑接口
 */
public interface StudentService {
    Student addStudent(Student student);

    Student queryStudent(Long id);

    void updateStudent(Student student);

    void deleteStudent(Long id);
}
