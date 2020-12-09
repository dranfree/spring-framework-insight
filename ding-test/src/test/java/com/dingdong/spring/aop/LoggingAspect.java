package com.dingdong.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * add org.aspectj:aspectjweaver dependency
 *
 * @author GuanShan
 * @since 2020.12.09
 */
@Aspect
// must be a component of spring ioc
@Component
public class LoggingAspect {

    @Pointcut("@annotation(com.dingdong.spring.aop.LoggingRequired)")
    public void aspectTo() { }

    @Before("aspectTo()")
    public void doBefore(JoinPoint JP) {
        System.out.println(Arrays.toString(JP.getArgs()));
    }
}