package advisor;

/**
 * 客户实现类<br>
 * create:2016-12-24 15:40
 *
 * @author zhou
 */
public class CustomDaoImpl implements CustomDao {

    @Override
    public void add() {
        System.out.println("客户添加。。。。。");
    }

    @Override
    public void delete() {
        System.out.println("客户删除。。。。。");
    }

    @Override
    public void update() {
        System.out.println("客户更改。。。。。");
    }

    @Override
    public void search() {
        System.out.println("客户查询。。。。。");
    }
}
