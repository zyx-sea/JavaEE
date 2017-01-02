package cn.july.shop.service.impl;

import cn.july.shop.dao.mapper.UserMapper;
import cn.july.shop.model.User;
import cn.july.shop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户<br>
 * create:2016-12-29 10:03
 *
 * @author zhou
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        User u = userMapper.checkUser(username, password);
        return u;
    }
}
