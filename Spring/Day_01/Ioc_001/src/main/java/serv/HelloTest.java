package serv;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * 测试类<br>
 * create:2016-12-18 16:51
 *
 * @author zhou
 */
public class HelloTest {

    @Test
    public void sayTest() {
       /*传统方法，耦合性强*/
        HelloDao hello = new Hello();
        hello.say();

    /*工厂+反射+配置文件，实例化接口的对象*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    /*通过工厂根据配置名称获取实例对象*/
        HelloDao hello2 = (HelloDao) applicationContext.getBean("hello");
        hello2.say();
        /*IOC反转控制，就是把创建对象的权利交到Spring中*/
    }

    /*读取工程根目录下的xml*/
    @Test
    public void SayTst() {
 /*工厂+反射+配置文件，实例化接口的对象*/
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
    /*通过工厂根据配置名称获取实例对象*/
        HelloDao hello2 = (HelloDao) applicationContext.getBean("hello");
        hello2.say();
        /*IOC反转控制，就是把创建对象的权利交到Spring中*/
    }

    /*使用BeanFactory加载配置文件，实现工厂*/
    @Test
    public void SayTs() {

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
        HelloDao hello2 = (HelloDao) beanFactory.getBean("hello");
        hello2.say();
    }
}