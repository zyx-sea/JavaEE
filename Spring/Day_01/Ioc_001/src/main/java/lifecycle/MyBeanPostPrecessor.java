package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 自定义后处理器Bean<br>
 * create:2016-12-22 22:46
 *
 * @author zhou
 */
public class MyBeanPostPrecessor implements BeanPostProcessor {

    /*object o对象实例
    * String s 就是bean的id或name*/
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("第五部：执行后处理bean的初始化前的方法。。");
        if(o.equals("user")){
            //需要进行时间监控Bean
            /*使用匿名内部类*/
            Object proxy= Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.getName().equals("search")) {
                        //增强add方法
                        System.out.println("开始时间："+System.currentTimeMillis());
                        Object result=method.invoke(o,args);
                        System.out.println("结束时间："+System.currentTimeMillis());
                        return result;
                    }
                    else{
                        /*不加强*/
                        return method.invoke(o,args);
                    }


                }
            });
            return proxy;
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("第八部：执行后处理bean  初始化完成后的方法");
        return o;
    }
}
