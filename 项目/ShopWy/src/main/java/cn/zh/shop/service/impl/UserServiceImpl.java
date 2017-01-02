package cn.zh.shop.service.impl;

import cn.zh.shop.dao.UserMapper;
import cn.zh.shop.model.Person;
import cn.zh.shop.service.inter.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 用户接口实现类<br>
 * create:2016-11-22 21:26
 *
 * @author zhou
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

    private Person user;
    private SqlSessionFactory sessionFactory;
    private SqlSession session;
    private UserMapper userMapper;
    private String username;

    public UserServiceImpl() throws IOException {
        //声明配置文件的读值
        String resource = "Configure.xml";
        //加载应用配置文件
        InputStream reader = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        Configuration configuration = sessionFactory.getConfiguration();
        configuration.addMapper(UserMapper.class);
        //获取session类
        session = sessionFactory.openSession();
    }
    @Override
    public Person check(String username) {
        try {
            //获取操作类
            userMapper = session.getMapper(UserMapper.class);
            //完成查询操作
            user = userMapper.check(username);
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            session.close();
            return user;
        }
    }


}
