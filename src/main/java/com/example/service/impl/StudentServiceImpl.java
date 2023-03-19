package com.example.service.impl;

import com.example.dao.entity.Student;
import com.example.dao.repository.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Service层
 * 具体的业务逻辑服务层（学生）
 * 接口实现类
 */
@Service  //标明 我是service层
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    //根据学生id，查询学生信息
    @Override
    public Student queryStudent(Long id){
        return studentMapper.selectByPrimaryKey(id);
    }
}
