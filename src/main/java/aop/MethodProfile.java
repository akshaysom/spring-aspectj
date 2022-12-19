package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
//@Component
public class MethodProfile {
  @Pointcut("call(* service.MainService.apiInnerService(..))")
  public void testAspectPointcut() { }

  @Around("testAspectPointcut()")
  public Object testAspectAround(ProceedingJoinPoint thisJoinPoint) throws Throwable {
    System.out.println("Before Around :testAspectPointcut");
    try {
      return thisJoinPoint.proceed();
    }
    finally {
      System.out.println("After Around");
    }
  }
}
