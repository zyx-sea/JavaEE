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

    //管理员登录验证
    public User checkadmin(String username,String password);

    //用户注册
    public void add(User user);

    //按姓名查询用户信息
    public User query(String username);

    //根据id删除商品信息
    public void delete(int id);
}
