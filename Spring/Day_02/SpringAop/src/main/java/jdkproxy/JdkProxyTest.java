package jdkproxy;

import org.junit.Test;

/**
 * jdk动态代理测试类<br>
 * create:2016-12-24 11:00
 *
 * @author zhou
 */
public class JdkProxyTest {

    @Test
    public void demo() {
        UserDao userDao = new UserDaoImpl();/*被代理类*/
        MyProxy myProxy = new MyProxy(userDao);
        UserDao proxy = myProxy.createProxy();/*代理类*/
        proxy.add();
        proxy.search();
    }
}