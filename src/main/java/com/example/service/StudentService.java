package com.example.service;

import com.example.dao.entity.Student;

/**
 * Service层
 * 具体的业务逻辑服务层（学生）
 * 接口
 */
public interface StudentService {
    //根据学生id，查询学生信息
    Student queryStudent(Long id);
}
