package com.venus.insight.aop.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author RanYeah
 * @since 2022/9/7
 */
public class RanYeahBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("RanYeahBeforeAdvice");
	}
}
