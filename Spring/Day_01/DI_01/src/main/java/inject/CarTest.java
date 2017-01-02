package inject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入测试<br>
 * create:2016-12-22 23:51
 *
 * @author zhou
 */
public class CarTest {

    /*构造方法的注入*/
    @Test
    public void demo1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car= (Car) applicationContext.getBean("car");
        System.out.println(car.toString());
    }

    /*set方法的注入*/
    @Test
    public void demo2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Cycle cycle= (Cycle) applicationContext.getBean("cycle");
        System.out.println(cycle.toString());
    }

}
