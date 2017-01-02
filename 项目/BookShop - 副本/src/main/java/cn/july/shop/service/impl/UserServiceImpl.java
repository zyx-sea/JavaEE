package cn.july.shop.service.impl;

import cn.july.shop.dao.mapper.UserMapper;
import cn.july.shop.model.User;
import cn.july.shop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用户<br>
 * create:2016-12-29 10:03
 *
 * @author zhou
 */
public class UserServiceImpl implements UserService {

    @Override
    public User login(String username, String password) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context-dao.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        User u = userMapper.checkUser(username,password);
        return u;
    }
}
