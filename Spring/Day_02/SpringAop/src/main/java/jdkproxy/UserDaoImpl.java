package jdkproxy;

/**
 * 接口实现类<br>
 * create:2016-12-24 10:58
 *
 * @author zhou
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("添加用户。。。。。");
    }

    @Override
    public void search() {
        System.out.println("查询用户。。。。");
    }
}
