package aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Objects;

/**
 * 自定义切面类<br>
 * create:2016-12-25 11:53
 *
 * @author zhou
 */
@Aspect
public class MyAspect {

    /*前置增强*/
    @Before("execution(* aspectj.annotation.UserDao.add (..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强。。。。" + joinPoint.toString());
    }

    /*后置增强*/
    @AfterReturning(value = "execution(* aspectj.annotation.UserDao.update (..))", returning = "returnValue")
    public void after(Object returnValue) {
        System.out.println("后置增强。。。。返回值是：" + returnValue);
    }

    /*环绕增强*/
    @Around(value = "execution(* aspectj.annotation.UserDao.delete (..))")
    /*可阻止被代理方法增强*/
    public Objects around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强");
        Object result=proceedingJoinPoint.proceed();/*使得被代理方法被执行*/
        System.out.println("环绕后增强");
        return (Objects) result;
    }

    /*抛出异常通知*/
    /*只有再出现异常时才会执行*/
    @AfterThrowing(value = "execution(* aspectj.annotation.UserDao.search (..))",throwing = "ex")
    public void throwing(Throwable ex){
        System.out.println("异常抛出。。。。。。"+ex.getMessage());
    }

    /*最终异常通知，必须执行的方法*/
    @After(value = "execution(* aspectj.annotation.UserDao.search(..))")
    public void finall(){
        System.out.println("这是一个最终必须执行的方法！！无论是否有异常！！");
    }

    /*切点定义，用于定义表达式，方便维护*/
    @Pointcut("execution(* aspectj.annotation.UserDao.delete (..))")
    private void mypointcut(){
    }
}
