package com.example.dao.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * create table teacher
 * (
 *     id     bigint auto_increment comment '主键；教师id' primary key,
 *     t_name varchar(50) not null comment '教师姓名',
 *     t_age  int         null comment '教师年龄'
 * )
 *     comment '教师表';
 */
@Data
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="t_name")
    private String tName;

    @Column(name="t_age")
    private Integer tAge;
}
