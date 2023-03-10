package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@MapperScan(basePackages = {"com.example.dao.repository.mapper"})
@SpringBootApplication
public class MyStudentManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentManageApplication.class, args);
    }

}
