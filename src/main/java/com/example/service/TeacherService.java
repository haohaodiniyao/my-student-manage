package com.example.service;

import com.example.dao.entity.Teacher;

/**
 * 教师业务逻辑接口
 */
public interface TeacherService {
    /**
     * 添加教师
     * @param teacher
     * @return
     */
    Teacher addTeacher(Teacher teacher);

    Teacher queryTeacher(Long id);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(Long id);
}
