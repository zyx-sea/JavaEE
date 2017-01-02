package pointcut_advisor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 带切点的切面测试<br>
 * create:2016-12-24 20:22
 *
 * @author zhou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class PointTest {
    @Autowired
    @Qualifier("orderDaoProxy")
    private OrderDao orderDao;
    @Test
    public void demo(){
        orderDao.search();
        orderDao.add();
        orderDao.update();
        orderDao.delete();

    }

}
