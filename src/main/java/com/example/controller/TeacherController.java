package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.common.Result;
import com.example.common.ResultUtil;
import com.example.dao.entity.Teacher;
import com.example.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 教师对外api接口
 */
@Slf4j//日志注解
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    /**
     * 教师业务逻辑接口
     */
    @Resource
    private TeacherService teacherService;

    /**
     * 查询教师信息，根据教师id
     * @param id
     * @return
     */
    @RequestMapping("/query")
    public Result queryTeacher(Long id){
        if(id == null){
            return ResultUtil.fail("教师id不能为空");
        }
        try{
            Teacher teacher = teacherService.queryTeacher(id);
            return ResultUtil.success(teacher);
        }catch (Exception e){
            log.error("查询教师异常",e);
        }
        return ResultUtil.fail();
    }

    /**
     * 添加教师信息
     * @param teacher
     */
    @RequestMapping("/add")
    public Result addTeacher(Teacher teacher){
        //日志(打印请求参数)
        log.info("请求参数 = {}", JSON.toJSONString(teacher));
        //校验请求参数
        if(teacher == null){
            return ResultUtil.fail("请求参数不能为空");
        }
        try {
            Teacher add = teacherService.addTeacher(teacher);
            return ResultUtil.success(add);
        }catch (Exception e){
            log.error("添加教师异常",e);
        }
        return ResultUtil.fail();
    }

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    @RequestMapping("/update")
    public Result updateTeacher(Teacher teacher){
        //日志(打印请求参数)
        log.info("请求参数 = {}", JSON.toJSONString(teacher));
        //校验请求参数
        if(teacher == null){
            return ResultUtil.fail("请求参数不能为空");
        }
        if (teacher.getId() == null){
            return ResultUtil.fail("教师id不能为空");
        }
        try{
            teacherService.updateTeacher(teacher);
        }catch (Exception e){
            //日志（打印异常）
            log.error("修改教师异常",e);
            return ResultUtil.fail();
        }
        return ResultUtil.success();
    }

    /**
     * 删除教师
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public Result deleteTeacher(Long id){
        //日志(打印请求参数)
        log.info("请求参数id = {}",id);
        //校验请求参数
        if(id == null){
            return ResultUtil.fail("教师id不能为空");
        }

        try{
            teacherService.deleteTeacher(id);
        }catch (Exception e){
            //日志（打印异常）
            log.info("删除教师异常",e);
            return ResultUtil.fail();
        }
        return ResultUtil.success();
    }
}
