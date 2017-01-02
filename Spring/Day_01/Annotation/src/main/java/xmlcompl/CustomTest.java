package xmlcompl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xml与注释混合使用测试<br>
 * create:2016-12-23 19:45
 *
 * @author zhou
 */
public class CustomTest {
    @Test
    public void demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        CustomService customService = (CustomService) applicationContext.getBean("custom");
        System.out.println(customService);
    }



}
