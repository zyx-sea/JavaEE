package cn.july.shop.service;

import cn.july.shop.model.User;

/**
 * <br>
 * create:2016-12-29 10:02
 *
 * @author zhou
 */
public interface UserService {

    //验证登录
    public User login(String username,String password);

}
