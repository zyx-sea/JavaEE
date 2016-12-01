package cn.qd.mybatis.dao;

import cn.qd.mybatis.pojo.User;

import java.util.List;

/**
 * 用户接口类<br>
 * create:2016-10-23 11:16
 *
 * @author zhou
 * @version 1.0
 */
public interface UserDao {
    //根据id查询用户信息
    public User findUserById(int id) throws Exception ;
    //根据用户名称模糊查询用户列表
    public List<User>  findUserByUsername(String username) throws Exception;
    //插入用户
    public void insertUser(User user) throws Exception;


}
