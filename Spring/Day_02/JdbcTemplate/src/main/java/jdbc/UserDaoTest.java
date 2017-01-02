package jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * userDao测试类<br>
 * create:2016-12-26 14:37
 * 测试userDao的CURD
 *
 * @author zhou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    /*添加*/
    @Test
    public void saveTest() {
        User user = new User();
        user.setId(12);
        user.setName("lisa");
        userDao.save(user);
    }
    /*修改*/
    @Test
    public void updateTest(){
        User user=new User();
        user.setId(12);
        user.setName("july");
        userDao.update(user);
    }

    /*简单查询*/
    /*记录总数*/
    @Test
    public void countTest(){
        System.out.println(userDao.count());
    }

    /*根据id查询name*/
    @Test
    public void findNameTest(){

        System.out.println(userDao.findName(12));
    }

    /*查询一个对象*/
    @Test
    public void findUserTest(){
        System.out.println(userDao.findUser(12).toString());
    }
    /*查询所有*/
    @Test
    public void fingAllTest(){
        System.out.println(userDao.findAll().toArray().toString());
    }
}
