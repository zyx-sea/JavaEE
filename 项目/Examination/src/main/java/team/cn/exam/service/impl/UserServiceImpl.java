package team.cn.exam.service.impl;

import org.springframework.stereotype.Service;
import team.cn.exam.dao.mapper.UserMapper;
import team.cn.exam.model.User;
import team.cn.exam.service.UserService;

import javax.annotation.Resource;

/**
 * <br>
 * create:2017-04-09 21:02
 *
 * @author zhou
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User check(String username, String password) {
        User u = userMapper.check(username, password);
        return u;
    }

    @Override
    public void add(User user) {

    }
}
