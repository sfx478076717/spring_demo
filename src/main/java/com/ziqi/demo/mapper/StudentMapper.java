package com.ziqi.demo.mapper;

import com.ziqi.demo.config.MyMapper;
import com.ziqi.demo.domain.Student;
import com.ziqi.demo.domain.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ziqi
 * @date Created in 2020-08-15
 */
@Mapper
public interface StudentMapper extends MyMapper<Student> {

    List<Student> selectAllStudents();

    List<StudentDTO> selectById(Integer id);

    List<Student> selectByName(String name);

    List<Student> selectByNameAndAge(@Param("name") String name123, @Param("age") Integer age);

    List<Student> selectByNameList(List<String> nameList);

    List<Student> selectByAge(Integer age);

    List<Student> selectBySearchKey(Map map);

    List<Student> selectUseTrim(Integer id);

    int updateUseTrim(Student student);

    int updateByName(Student student);

    int updateByNameUseSet(Student student);

    int insertValue(Student student);
}
