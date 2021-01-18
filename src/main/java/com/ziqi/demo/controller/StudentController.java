package com.ziqi.demo.controller;

import com.ziqi.demo.domain.Student;
import com.ziqi.demo.domain.dto.StudentDTO;
import com.ziqi.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 对Student的操作
 *
 *
 * @version        Enter version here..., 17/10/11
 * @author         Enter your name here...
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/select/all")
    public List<Student> selectAllStudent() {
        return studentService.selectAllStudents();
    }

    @RequestMapping(value = "/select/name/{name}", method = RequestMethod.POST)
    public List<Student> selectByName(@PathVariable String name) {
        return studentService.selectByName(name);
    }

    @PostMapping(value = "/select/id/{id}")
    public List<StudentDTO> selectById(@PathVariable Integer id) {
        return studentService.selectById(id);
    }

    @GetMapping(value = "/select")
    public List<Student> selectByNameAndAge(@RequestParam String name, @RequestParam Integer age) {
        return studentService.selectByNameAndAge(name, age);
    }

    @PostMapping("/select/nameList")
    public List<Student> selectByNameList(@RequestBody List<String> nameList) {
        return studentService.selectByNameList(nameList);
    }

    @PostMapping("/select/age/{age}")
    public List<Student> selectByAge(@PathVariable Integer age) {
        return studentService.selectByAge(age);
    }

    @PostMapping(value = "/select/page")
    public List<Student> selectBySearchKey(@RequestBody Map<String, Object> map) {
        return studentService.selectBySearchKey(map);
    }

    @PostMapping(value = "/select/trim/{id}")
    public List<Student> selectUseTrim(@PathVariable Integer id) {
        return studentService.selectUseTrim(id);
    }

    @PutMapping
    public Integer update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return studentService.delete(id);
    }

    @PostMapping("/test")
    public Object test(@RequestParam String shardingNode) {
        return studentService.test(shardingNode);
    }
}
