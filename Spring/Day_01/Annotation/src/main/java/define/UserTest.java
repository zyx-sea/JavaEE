package define;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配测试<br>
 * create:2016-12-23 18:09
 *
 * @author zhou
 */
public class UserTest {

    @Test
    public void demo(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user= (UserService) applicationContext.getBean("UserService");
        System.out.println(user.toString());
    }

}
