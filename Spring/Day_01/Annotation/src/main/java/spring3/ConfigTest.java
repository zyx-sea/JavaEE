package spring3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 * create:2016-12-23 19:34
 *
 * @author zhou
 */
public class ConfigTest {

    @Test
            public void demo(){

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    Car car= (Car) applicationContext.getBean("car");
    Product product= (Product) applicationContext.getBean("product");
        System.out.println(car+""+product);
}
}
