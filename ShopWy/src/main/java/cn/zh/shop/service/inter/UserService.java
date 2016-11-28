package cn.zh.shop.service.inter;

import cn.zh.shop.model.Person;

/**
 * 用户接口类<br>
 * create:2016-11-22 21:24
 *
 * @author zhou
 * @version 1.0
 */
public interface UserService {

    public Person check(String username);

}
