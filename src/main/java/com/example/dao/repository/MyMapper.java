package com.example.dao.repository;

import tk.mybatis.mapper.common.*;

public interface MyMapper<T>  extends BaseMapper<T>, MySqlMapper<T>, ExampleMapper<T>, ConditionMapper<T>, IdsMapper<T> {
}