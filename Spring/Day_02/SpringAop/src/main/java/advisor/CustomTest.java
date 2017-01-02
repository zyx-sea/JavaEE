package advisor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * advisor测试<br>
 * create:2016-12-24 16:46
 *
 * @author zhou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CustomTest {
    /*对测试对象进行自动注入*/
    @Autowired
    /*@Qualifier("customDao")  *//*注入代理前的对象*/
    @Qualifier("myproxy")  /*注入代理后的对象*/
    private CustomDao customDao;
    @Test
    public void demo(){
        customDao.add();
        customDao.delete();
        customDao.update();
        customDao.search();
    }

}
