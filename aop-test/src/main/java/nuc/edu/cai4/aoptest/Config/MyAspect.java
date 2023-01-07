package nuc.edu.cai4.aoptest.Config;


import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * • execution 表示在执行的时候，拦截里面的正则匹配的方法： . ＊表示任意返回类型的方法：
 * • nuc.edu.cai4.aoptest.Service.Impl.UserServiceImpl指定目标对象的全限定名称：
 * • printUser 指定目标对象的方法：
 * • （..）表示任意参数进行匹配。
 *
 */



@Aspect
@Configuration
//@Component
public class MyAspect {
    @Pointcut("execution(* nuc.edu.cai4.aoptest.Service.Impl.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    //@Before("execution(* nuc.edu.cai4.aoptest.Service.Impl.UserServiceImpl.printUser(..))")
    @Before("pointCut()")
    public void before() {
        System.out.println("希望在printUser方法之前执行");
    }
//@After("execution(* nuc.edu.cai4.aoptest.Service.Impl.UserServiceImpl.printUser(..))")
    @After("pointCut()")
    public void after() {
        System.out.println("希望在printUser方法之后执行");
    }
//@AfterReturning("execution(* nuc.edu.cai4.aoptest.Service.Impl.UserServiceImpl.printUser(..))")
    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("希望在printUser方法成功执行之后执行");
    }
//@AfterThrowing("execution(* nuc.edu.cai4.aoptest.Service.Impl.UserServiceImpl.printUser(..))")
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("printUser方法发生异常的时候执行");
    }
}
