package com.ziqi.demo.service;

import com.ziqi.demo.config.ThreadLocalCustomer;
import com.ziqi.demo.domain.Student;
import com.ziqi.demo.domain.dto.StudentDTO;
import com.ziqi.demo.mapper.StudentMapper;
import com.ziqi.demo.mapper.TbDateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentMapper studentMapper;
    private final TbDateMapper tbDateMapper;

    public List<Student> selectAllStudents() {
        return studentMapper.selectAllStudents();
    }

    public List<StudentDTO> selectById(Integer id) {
        return studentMapper.selectById(id);
    }

    public List<Student> selectByName(String name) {
        return studentMapper.selectByName(name);
    }

    public List<Student> selectByNameAndAge(String name, Integer age) {
        return studentMapper.selectByNameAndAge(name, age);
    }

    public List<Student> selectByNameList(List<String> nameList) {
        return studentMapper.selectByNameList(nameList);
    }

    public List<Student> selectByAge(Integer age) {
        return studentMapper.selectByAge(age);
    }

    public List<Student> selectBySearchKey(Map<String, Object> map) {
        return studentMapper.selectBySearchKey(map);
    }

    public List<Student> selectUseTrim(Integer id) {
        return studentMapper.selectUseTrim(id);
    }

    public int update(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    public int delete(Integer id) {
        return studentMapper.deleteByPrimaryKey(id);
    }


    public Object test(String shardingNode) {
        Map<String, String> map = new HashMap<>();
        map.put("shardingNode", shardingNode);
        ThreadLocalCustomer.setCustomerCode(shardingNode);
        List<Object> test = tbDateMapper.test(map);

        return test;
    }
}
