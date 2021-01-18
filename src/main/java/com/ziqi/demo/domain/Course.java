package com.ziqi.demo.domain;

import lombok.Data;

/**
 * 所学科目
 * @author ziqi
 * @date Created in 2020-08-16
 */
@Data
public class Course {
    private Integer id;
    private String studentId;
    private String courseName;
}
