package SpringLesson;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * Created by Oleg on 29.03.14.
 */
@Aspect
@Component
public class BeforeExample {
    //@Before("execution(*SpringLesson.*.sendGreetings(..))")
    @Before("execution(* SpringLesson.*.sendGreetings(..))")
    public void doAccessCheck() {
        System.out.println("Before method call");
    }

    @Around("execution(* SpringLesson.*.sendGreetings(..))")
    public void doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("instead method call");
        pjp.proceed();
    }


}
