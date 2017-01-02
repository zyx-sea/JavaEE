package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理<br>
 * create:2016-12-24 11:23
 *
 * @author zhou
 */
public class MyProxy implements InvocationHandler {

    private UserDao userDao;//被代理对象

    /*通过被代理类对象构造代理类*/
    public MyProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao createProxy() {

        /*jdk代理只能代理接口*/
        return (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
    }

    @Override
    /*访问被代理对象任何方法，都和执行*/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*针对add方法进行增强，记录日志*/
        if (method.getName().equals("add")) {
            System.out.println("记录日志");
            /*调用目标方法*/
            return method.invoke(userDao, args);
        } else {
            return method.invoke(userDao, args);
        }
    }
}
