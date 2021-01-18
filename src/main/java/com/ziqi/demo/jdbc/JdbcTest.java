package com.ziqi.demo.jdbc;

import com.ziqi.demo.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ziqi
 * @date Created in 2020-08-15
 */


public class JdbcTest {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // 1.注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2.建立连接
            // 参数一：协议+访问数据库，参数二：用户名，参数三：密码
            String url = "jdbc:mysql://192.168.102.138:8066?useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false&serverTimezone=Asia/Shanghai&useAffectedRows=true";
            connection = DriverManager.getConnection(url, "root2:cml", "123456");

            // 3.创建statement，跟数据库打交道一定需要这个对象
            st = connection.createStatement();

            // 4.执行查询
            String sql = "show databases;";
            rs = st.executeQuery(sql);

            // 5.遍历查询每一条记录
            while(rs.next()) {
                String name = rs.getString("DATABASE");

                nameList.add(name);
            }
            // 进行资源释放
            connection.close();
            st.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        nameList.forEach(System.out::println);
    }
}
