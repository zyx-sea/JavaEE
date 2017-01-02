package aspectj.baenxml;

/**
 * 商品操作类<br>
 * create:2016-12-25 17:07
 *
 * @author zhou
 */
public class ProductDao {

    public void add() {
        System.out.println("添加商品。。。。");
    }

    public int delete() {
        System.out.println("删除商品。。。。");
        return 10;
    }


}
