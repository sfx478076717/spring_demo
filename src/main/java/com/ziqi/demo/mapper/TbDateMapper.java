package com.ziqi.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ziqi
 * @date Created in 2020-08-15
 */
@Mapper
public interface TbDateMapper {

    List<Object> test(Map map);

}
