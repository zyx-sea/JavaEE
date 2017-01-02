package auto_proxy;

import advisor.CustomDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pointcut_advisor.OrderDao;

/**
 * 自动代理测试<br>
 * create:2016-12-24 21:03
 *
 * @author zhou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext2.xml")
public class AutoProxyTest {

    @Autowired
    @Qualifier("customDao")
    private CustomDao customDao;

    @Autowired
    @Qualifier("orderDao")
    private OrderDao orderDao;
    @Test
    public void demo() {
        customDao.add();
        orderDao.add();
    }
}
