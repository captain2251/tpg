package question;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {

   /** Following is the definition for a PointCut to select
    *  all the methods available. So advice will be called
    *  for all the methods.
    */
   @Pointcut("execution(* question.*.*(..))")
   private void timeMonitor(){}

   @Around("timeMonitor()")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		System.out.println("Going to call the method.");
		Object output = pjp.proceed();
		System.out.println("Method execution completed.");
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
		return output;
	}
}