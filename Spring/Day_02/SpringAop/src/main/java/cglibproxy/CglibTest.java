package cglibproxy;

import org.junit.Test;

/**
 * cglib测试类<br>
 * create:2016-12-24 11:45
 *
 * @author zhou
 */
public class CglibTest {

    @Test
    public void demo() {
        ProductDao productDao = new ProductDao();
        MyCglibProxy myCglibProxy = new MyCglibProxy(productDao);
        ProductDao proxy = myCglibProxy.createProxy();
    /*代理类执行*/
        proxy.add();
        proxy.delete();

    }

}
