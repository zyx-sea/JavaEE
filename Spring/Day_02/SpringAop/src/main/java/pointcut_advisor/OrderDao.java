package pointcut_advisor;

/**
 * 订单操作<br>
 * create:2016-12-24 19:49
 *
 * @author zhou
 */
public class OrderDao {

    public void add() {
        System.out.println("订单添加。。。。。");
    }


    public void delete() {
        System.out.println("订单删除。。。。。");
    }


    public void update() {
        System.out.println("订单更改。。。。。");
    }

    public void search() {
        System.out.println("订单查询。。。。。");
    }
}