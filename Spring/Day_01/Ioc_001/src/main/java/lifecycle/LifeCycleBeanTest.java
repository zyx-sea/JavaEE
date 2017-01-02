package lifecycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试<br>
 * create:2016-12-22 17:01
 *
 * @author zhou
 */
public class LifeCycleBeanTest {

    @Test
    public void demo(){
        /*只有使用applicantContext子类才能进行关闭，执行销毁方法*/
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeCycleBean lifeCycleBean= (LifeCycleBean) applicationContext.getBean("lifecyclebean");
        System.out.println(lifeCycleBean);
        applicationContext.close();
    }

    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user= (UserDao) applicationContext.getBean("userdao");
        user.add();
        user.search();
        applicationContext.close();
    }
}
