package cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理类<br>
 * create:2016-12-24 11:45
 *
 * @author zhou
 */
public class MyCglibProxy implements MethodInterceptor {

    /*目标对象*/
    private ProductDao productDao;

    /*通过构造器传入代理对象*/
    public MyCglibProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductDao createProxy() {
        /*创建代理的核心对象*/
        Enhancer enhancer = new Enhancer();
        /*设置被代理类*/
        enhancer.setSuperclass(productDao.getClass());
        /*设置回调函数*/
        enhancer.setCallback(this);
        return (ProductDao) enhancer.create();
    }

    @Override
    /*被代理对象所有方法执行，都会调用此方法*/
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        /*为add方法打印时间*/
        if (method.getName().equals("add")) {
            long start = System.currentTimeMillis();
            long end = System.currentTimeMillis();
            Object result=methodProxy.invokeSuper(proxy, args);
            System.out.println("执行时间为：" + (end - start));
            return result;
        } else {
            /*不进行加强*/
            return methodProxy.invokeSuper(proxy, args);
        }
    }
}
