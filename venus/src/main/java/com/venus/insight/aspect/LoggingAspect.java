package com.venus.insight.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/8/30
 */
@Aspect
@Component
public class LoggingAspect {

	@Around("execution(* com.venus..*.*(..))")
	public Object doAround(ProceedingJoinPoint point) throws Throwable {
		MethodSignature signature = (MethodSignature) point.getSignature();
		System.out.println("方法执行前执行...");
		Object ret = point.proceed();
		System.out.println("方法执行后执行...");
		return ret;
	}
}
