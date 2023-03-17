package com.example.dao.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 学生
 * 和数据库表一一对应
 */
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="address")
    private String address;
}
