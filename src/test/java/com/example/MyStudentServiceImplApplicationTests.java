package com.example;

import com.example.dao.entity.Student;
import com.example.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyStudentServiceImplApplicationTests {

    @Autowired
    private StudentServiceImpl studentServiceImpl;
    @Test
    void contextLoads() {
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(10);
        studentServiceImpl.addStudent(student);
    }

}
