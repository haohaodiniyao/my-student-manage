package com.example;

import com.example.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyStudentServiceImplApplicationTests {
    @Test
    void contextLoads() {
        StudentServiceImpl studentService = new StudentServiceImpl();
    }

}
