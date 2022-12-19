package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodProfile {

	public MethodProfile() {
		
	}
 	@Pointcut("(call(* service.apiInnerService(..)))")
    public void testAspectPointcut() {
    }
    @Around("testAspectPointcut()")
    public Object testAspectAround(ProceedingJoinPoint thisJoinPoint) throws Throwable {
    	System.out.println("Before Around :testAspectPointcut");
    	Object pjp= thisJoinPoint.proceed();
    	System.out.println("After Around");
    	return pjp;
    }
}
