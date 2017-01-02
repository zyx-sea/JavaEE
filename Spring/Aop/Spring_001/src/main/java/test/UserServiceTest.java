package test;

import model.User;
import org.jdom.JDOMException;
import org.junit.Test;
import service.UserService;
import spring.BeanFactory;
import spring.ClassPathXmlApplocationContext;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * UserServiceTest<br>
 * create:2016-12-04 20:43
 *
 * @author zhou
 * @version 1.0
 */
public class UserServiceTest {

    @Test
    public void testadd() throws IOException, JDOMException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BeanFactory factory=new ClassPathXmlApplocationContext();
       /* UserDao userDao= (UserDao) factory.getBean("user");
        UserService userService=new UserService();
        userService.setUserDao(userDao);*/
        User user1=new User();
       UserService userService= (UserService) factory.getBean("userService");
        userService.add(user1);
    }

}
