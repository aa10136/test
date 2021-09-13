package com.itd.dao.impl;

import com.itd.dao.UserDao;
import com.itd.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author Administrator
 * @Date 2021/9/2 10:28
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List<String> strList;
    private Map<String,User>userMap;
    private Properties properties;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    // ctrl + d 向下复制   ctrl + alt + l 格式化代码
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running......");

    }
}
