package service;

import dao.UserDao;
import model.User;

/**
 * <br>
 * create:2016-12-04 11:15
 *
 * @author zhou
 */
public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user){
        this.userDao.save(user);
    }
}
