package com.example.controller;

import com.example.common.Result;
import com.example.common.ResultUtil;
import com.example.dao.entity.Student;
import com.example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生对外api接口
 */
@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * 引入处理学生业务对象
     */
    @Autowired
    private StudentService studentService;

    /**
     * 根据学生id，查询学生信息
     * @param id
     * @return
     */
    @RequestMapping("/query")
    public Result queryStudent(Long id){
        if(id == null){
            return ResultUtil.fail();
        }
        try{
            Student student = studentService.queryStudent(id);
            return ResultUtil.success(student);
        }catch (Exception e){
            log.error("查询学生异常",e);
        }
        return ResultUtil.fail();
    }

    /**
     * 添加学生信息
     * @param student
     */
    @RequestMapping("/add")
    public Result addStudent(Student student){
        try {
            Student add = studentService.addStudent(student);
            return ResultUtil.success(add);
        }catch (Exception e){
            log.error("添加学生信息异常",e);
        }
        return ResultUtil.fail();
    }

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    @RequestMapping("/update")
    public Result updateStudent(Student student){
        try{
            studentService.updateStudent(student);
        }catch (Exception e){
            log.error("修改学生信息异常",e);
            return ResultUtil.fail();
        }
        return ResultUtil.success(null);
    }

    /**
     * 删除学生信息
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Result deleteStudent(Long id){
        try{
            studentService.deleteStudent(id);
        }catch (Exception e){
            log.info("删除学生信息异常",e);
        }
        return ResultUtil.success(null);
    }
}
