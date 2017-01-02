package pointcut_advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 自定义环绕增强<br>
 * create:2016-12-24 19:56
 *
 * @author zhou
 */
public class MyMethodInterceptor implements MethodInterceptor{

    @Override
    /*进行增强的方法*/
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕增强方法前增强。。。");
        Object result=methodInvocation.proceed();/*目标方法执行*/
        System.out.println("环绕增强方法后增强。。。");
        return result;
    }
}
