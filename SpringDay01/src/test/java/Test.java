
import com.itd.dao.UserDao;
import com.itd.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author Administrator
 * @Date 2021/8/2 16:44
 * @Version 1.0
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserDaoImpl userDao = (UserDaoImpl) applicationContext.getBean("userDao");
        userDao.save();



    }

}
