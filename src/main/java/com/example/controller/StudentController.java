package com.example.controller;

import com.example.common.Result;
import com.example.common.ResultUtil;
import com.example.dao.entity.Student;
import com.example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller层
 * Web层主要职责：主要是对访问控制进行转发，各类基本参数校验，或者不复用的业务简单处理等。
 * 学生对外api接口
 * 请求示例：
 * 1、根据学生id查询学生信息：  http://localhost:8080/student/query?id=1
 * 2、根据学生id删除学生信息：  http://localhost:8080/student/delete?id=1
 */
@Slf4j                          //日志注解
@RestController                 //@RestController = @Controller + @ResponseBody
@RequestMapping("/student")
public class StudentController {
    /**
     * 具体的业务逻辑服务（学生）
     */
    @Autowired
    private StudentService studentService;


    //根据学生id，查询学生信息
    @GetMapping("/query")   //@GetMapping = @RequestMapping + get
    public Student queryStudent(Long id){
        Student student = null;
        try{
            student = studentService.queryStudent(id);
        }catch (Exception e){
            //打印异常
            log.error("查询学生异常",e);
        }
        return student;
    }
}
