package com.example.service.impl;

import com.example.dao.entity.Teacher;
import com.example.dao.repository.mapper.TeacherMapper;
import com.example.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * service层
 * 教师业务逻辑实现类
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public Teacher addTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher queryTeacher(Long id) {
        return null;
    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Long id) {

    }
}
