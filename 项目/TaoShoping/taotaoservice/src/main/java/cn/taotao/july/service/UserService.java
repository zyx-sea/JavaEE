package cn.taotao.july.service;

import cn.taotao.july.pojo.Person;

/**
 * 用户类<br>
 * create:2017-04-27 15:09
 *
 * @author zhou
 */
public interface UserService {
    Person findUserByName (String userName);

}
