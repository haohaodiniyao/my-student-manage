package com.example;

import com.example.dao.entity.Student;
import com.example.service.StudentManage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyStudentManageApplicationTests {

    @Autowired
    private StudentManage studentManage;
    @Test
    void contextLoads() {
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(10);
        studentManage.addStudent(student);
    }

}
