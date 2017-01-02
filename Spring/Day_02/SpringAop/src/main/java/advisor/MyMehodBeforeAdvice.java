package advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 自定义前置增强<br>
 * create:2016-12-24 15:44
 *
 * @author zhou
 */
public class MyMehodBeforeAdvice implements MethodBeforeAdvice {

    /*method 目标方法
    * args参数
    * target 目标对象*/
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置增强。。。。");

    }
}
