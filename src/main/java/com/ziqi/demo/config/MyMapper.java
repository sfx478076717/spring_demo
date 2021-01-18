package com.ziqi.demo.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ziqi
 * @date Created in 2020-08-15
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
