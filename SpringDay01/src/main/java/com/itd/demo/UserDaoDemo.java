package com.itd.demo;

import com.itd.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Administrator
 * @Date 2021/9/13 10:33
 * @Version 1.0
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
         UserDaoImpl userDao = (UserDaoImpl) app.getBean("userDao");
         userDao.save();
    }
}
