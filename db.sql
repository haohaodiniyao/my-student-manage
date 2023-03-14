create table student
(
    id      bigint auto_increment comment '主键；自增；学生id'
        primary key,
    name    varchar(10)   not null comment '姓名',
    age     int default 0 not null comment '年龄',
    address varchar(50)   not null comment '地址'
)
    comment '学生表';

