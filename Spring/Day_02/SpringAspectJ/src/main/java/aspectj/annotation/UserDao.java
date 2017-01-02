package aspectj.annotation;

/**
 * 被代理对象<br>
 * create:2016-12-25 11:50
 *
 * @author zhou
 */
public class UserDao {

    public void add() {
        System.out.println("添加用户。。。。");
    }

    public void delete() {
        System.out.println("删除用户。。。。");
    }

    public int update() {
        System.out.println("修改用户。。。。");
        return 1;
    }

    public void search() {
        System.out.println("查找用户。。。。");
    }

}
