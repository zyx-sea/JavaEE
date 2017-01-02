package scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 * create:2016-12-22 9:39
 *
 * @author zhou
 */
public class ScopeTest {

    @Test
    //通过scope属性指定Bean实例范围
    /*单次实例化*/
    public void demo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) applicationContext.getBean("product");
        System.out.println(product);
        Product product2 = (Product) applicationContext.getBean("product");
        System.out.println(product2);
    }
    /*多次实例化,*/
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) applicationContext.getBean("product2");
        System.out.println(product);
        Product product2 = (Product) applicationContext.getBean("product2");
        System.out.println(product2);
    }

}
