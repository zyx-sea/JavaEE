package collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * list注入测试<br>
 * create:2016-12-23 15:36
 *
 * @author zhou
 */
public class CollectionTest {

    @Test
    public void demo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collection");
        System.out.println(collectionBean.toString());
    }


}
