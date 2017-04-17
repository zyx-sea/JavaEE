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

    /*验证登录*/
    @Override
    public User check(String username, String password) {
        User u = userMapper.checkUser(username, password);
        return u;
    }

    /*管理员登陆验证*/
    @Override
    public User checkadmin(String username, String password) {
        User u = userMapper.checkAdmin(username, password);
        return u;
    }

    /*添加用户*/
    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    /*按姓名查询用户信息*/
    @Override
    public User query(String username) {
        User u=userMapper.query(username);
        return u;
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }
}
