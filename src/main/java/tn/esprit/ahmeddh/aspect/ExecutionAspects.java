package tn.esprit.ahmeddh.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class ExecutionAspects {
    @Around("execution(* tn.esprit.ahmeddh.service.IGenericServiceIMP.save(..))")
    public Object ExecutionMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object o=(Object)  proceedingJoinPoint.proceed();
        stopWatch.stop();
        log.info("execution time of method: {} is {} ",proceedingJoinPoint.getSignature().getName(), stopWatch.getLastTaskTimeMillis());
        return o ;
    }
}
