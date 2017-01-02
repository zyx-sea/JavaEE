package aspectj.baenxml;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Objects;


/**
 * 切面类<br>
 * create:2016-12-25 17:09
 *
 * @author zhou
 */
public class MyAspect {

    /*前置增强*/
    public void before(){
        System.out.println("前置增强。。。。。。。。。。。。");
    }

    /*后置增强*/
    public void after(Object returnValue){
        System.out.println("后置增强。。。。。。。。返回值是："+returnValue);

    }

    /*环绕增强*/
    public Objects around (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强。。。。");
        Object result=proceedingJoinPoint.proceed();
        System.out.println("环绕后增强。。。。。。。。。。");
        return (Objects) result;
    }

}
