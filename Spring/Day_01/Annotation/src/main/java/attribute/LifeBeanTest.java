package attribute;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 * create:2016-12-23 18:43
 *
 * @author zhou
 */
public class LifeBeanTest {

    @Test
    public void demo() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeCycleBean lifeCycleBean = (LifeCycleBean) applicationContext.getBean("lifebean");
        System.out.println(lifeCycleBean);
        applicationContext.close();
    }
    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       /*打印地址相同说明是单类的，不同则说明是多类的*/
        ScopBean scopBean= (ScopBean) applicationContext.getBean("scopeBean");
        System.out.println(scopBean);
        ScopBean scopBean2= (ScopBean) applicationContext.getBean("scopeBean");
        System.out.println(scopBean2);
    }

}
