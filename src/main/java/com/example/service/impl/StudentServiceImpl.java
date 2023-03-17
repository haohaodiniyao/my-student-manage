package com.example.service.impl;

import com.example.dao.entity.Student;
import com.example.dao.repository.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * service层
 * 学生业务逻辑实现类
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     * 新增学生
     * @param student
     */
    @Override
    @Transactional
    public Student addStudent(Student student){
        studentMapper.insert(student);
        return student;
    }

    /**
     * 查询学生，根据学生id
     * @param id
     * @return
     */
    @Override
    public Student queryStudent(Long id){
        return studentMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改学生信息，根据学生id
     * @param student
     */
    @Override
    @Transactional
    public void updateStudent(Student student){
        studentMapper.updateByPrimaryKeySelective(student);
    }

    /**
     * 删除学生，根据学生id
     * @param id
     */
    @Override
    public void deleteStudent(Long id){
        studentMapper.deleteByPrimaryKey(id);
    }
}
