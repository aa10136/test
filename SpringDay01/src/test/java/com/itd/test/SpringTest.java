package com.itd.test;

import com.itd.dao.UserDao;
import com.itd.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Administrator
 * @Date 2021/9/2 10:58
 * @Version 1.0
 */
public class SpringTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        UserDaoImpl userDao1 = (UserDaoImpl) app.getBean("userDao");
        userDao1.save();
    }
}
