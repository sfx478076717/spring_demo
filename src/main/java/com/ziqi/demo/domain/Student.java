package com.ziqi.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author ziqi
 * @date Created in 2020-08-15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {
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
    @Column(name = "stu_remark")
    private String remark;
}
