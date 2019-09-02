package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class VerifyCommon {
//    public boolean verify(){
//        System.out.println("----执行前置方法");
//        return true;
//    }
    @Pointcut("execution(* test.BusinessTest.test(..))")
    public void test(){}

//    @Before("test()")
//    @AfterThrowing("test()")
//    @AfterReturning("test()")
    @Around("test()")
    public boolean verify(ProceedingJoinPoint joinPoint){
        System.out.println("----执行前置方法");
        Object target = joinPoint.getTarget();
        Object[] parameters=joinPoint.getArgs();

        String testParam= (String) parameters[0];
        if(testParam==null||testParam.trim().length()==0){
            System.out.println("结果："+testParam+"----是空值");
            throw new RuntimeException("参数为空，请输入有效参数");
        }
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("----字符串不为空");
        return true;
    }
}
