package dao.impl;

import dao.UserDao;
import model.User;

/**
 * 接口实现类<br>
 * create:2016-12-04 20:03
 *
 * @author zhou
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void save(User user) {
        System.out.println("保存方法！！");
    }
}
