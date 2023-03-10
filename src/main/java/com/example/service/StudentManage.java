package com.example.service;

import com.example.dao.entity.Student;
import com.example.dao.repository.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManage {
    @Autowired
    private StudentMapper studentMapper;

    public void addStudent(Student student){
        studentMapper.insert(student);
    }
    public Student queryStudent(Long id){
        return studentMapper.selectByPrimaryKey(id);
    }
}
