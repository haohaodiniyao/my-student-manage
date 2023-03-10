package com.example.controller;

import com.example.dao.entity.Student;
import com.example.service.StudentManage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentManage studentManage;

    @RequestMapping("/query")
    public Student queryStudent(Long id){
        return studentManage.queryStudent(id);
    }
}
