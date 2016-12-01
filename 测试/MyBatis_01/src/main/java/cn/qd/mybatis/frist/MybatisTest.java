package cn.qd.mybatis.frist;

import cn.qd.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author July
 * @version 1.0
 * @date 2016年10月22日下午3:40:30
 * @Description 测试类
 */
public class MybatisTest {

    // 会话工厂
    private SqlSessionFactory SqlSessionFactory;

    // 创建工厂
    @Before
    public void init() throws IOException {

        // 配置文件（SqlMapConfig.xml）
        String resource = "SqlMapConfig.xml";

        // 加载配置文件到输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂
        SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    // 测试根据id查询用户（得到单条记录）
    @Test
    public void testFindUserById() {
        SqlSession sqlSession = SqlSessionFactory.openSession();
        // 通过sqlSessionFactory创建sqlSession
        // 通过sqlsesion操作数据库
        // 参数一：namespace+statement的id
        // 参数二：传入参数
        User user = null;
        try {
            user = sqlSession.selectOne("test.findUserById", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(user);

    }

    /*测试根据模糊姓名查询*/
    @Test
    public void testFindUserByName() {
        SqlSession sqlSession = SqlSessionFactory.openSession();

        List<User> list = null;
        try {
            list = sqlSession.selectList("test.findUserByName", "%小明%");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(list.get(0).getUsername());

    }

    @Test
    //测试插入一条记录
    public void testInsertUser() {
        //通过sqlsessionfactory创建sqlsession
        SqlSession sqlsession = SqlSessionFactory.openSession();

        //通过sqlsession操作数据库
        //创建插入数据对象
        User user = new User();
        user.setUsername("July");
        user.setBirthday(new Date());
        user.setAddress("山东");
        user.setSex("1");
        try {
            sqlsession.insert("test.insertUser", user);
            //提交事务
            sqlsession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("用户id=" + user.getId());
    }

    /*    测试根据id删除用户*/
    @Test
    public void testDeleteUser() {
        //通过sqlsessionfactory创建sqlsession
        SqlSession sqlsession = SqlSessionFactory.openSession();

        //通过sqlsession操作数据库
        try {
            sqlsession.delete("test.deleteUser", 1);
            sqlsession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*    测试更新用户*/
    @Test
    public void testUpdateUser() {
        //通过sqlsessionfactory创建sqlsession
        SqlSession sqlsession = SqlSessionFactory.openSession();
        // 通过sqlSession操作数据库
        // 创建更新数据对象，要求必须包括 id
        User user = new User();
        user.setId(1);
        user.setUsername("燕青");
        user.setAddress("河南郑州");
        user.setBirthday(new Date());
        user.setSex("1");
        try {
            sqlsession.update("test.updateUser", user);
            sqlsession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.print("用户id="+user.getId());
    }
}