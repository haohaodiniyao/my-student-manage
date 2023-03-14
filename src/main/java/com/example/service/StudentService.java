package com.example.service;

import com.example.dao.entity.Student;
import com.example.dao.repository.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service层
 * 处理学生业务
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 新增学生
     * @param student
     */
    public Student addStudent(Student student){
        studentMapper.insert(student);
        return student;
    }

    /**
     * 查询学生，根据学生id
     * @param id
     * @return
     */
    public Student queryStudent(Long id){
        return studentMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改学生信息，根据学生id
     * @param student
     */
    public void updateStudent(Student student){
        studentMapper.updateByPrimaryKeySelective(student);
    }

    /**
     * 删除学生，根据学生id
     * @param id
     */
    public void deleteStudent(Long id){
        studentMapper.deleteByPrimaryKey(id);
    }
}
