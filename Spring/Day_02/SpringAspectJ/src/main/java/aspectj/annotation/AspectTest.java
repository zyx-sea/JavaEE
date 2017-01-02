package aspectj.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 切面测试类<br>
 * create:2016-12-25 11:58
 *
 * @author zhou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AspectTest {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Test
    public void demo() {
        userDao.add();
        userDao.search();
        userDao.update();
        userDao.delete();
    }

}
