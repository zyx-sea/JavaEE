package aspectj.baenxml;

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
@ContextConfiguration(locations = "classpath:applicationContext2.xml")
public class AspectTest {

    @Autowired
    @Qualifier("productDao")
    private ProductDao productDao;

    @Test
    public void demo() {
        productDao.add();
        productDao.delete();
    }

}
