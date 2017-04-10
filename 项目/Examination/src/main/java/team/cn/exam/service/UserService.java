package team.cn.exam.service;

import team.cn.exam.model.User;

/**
 * 用户service<br>
 * create:2017-04-09 20:49
 *
 * @author zhou
 * @version 1.0
 */
public interface UserService {

    //登录验证
    public User check(String username,String password);

    //用户注册
    public void add(User user);
}
