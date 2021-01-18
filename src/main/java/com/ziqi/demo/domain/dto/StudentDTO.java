package com.ziqi.demo.domain.dto;

import com.ziqi.demo.domain.Course;
import com.ziqi.demo.domain.GradeMessage;
import lombok.Data;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Data
public class StudentDTO {
    @Id
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private Date birthday;

    private Short age;

    /**
     * 年级
     */
    private Byte grade;

    /**
     * 备注
     */
    private String remark;

    /**
     * 年级信息
     */
    private GradeMessage gradeMessage;

    private List<Course> courseList;
}