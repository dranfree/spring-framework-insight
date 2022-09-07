package com.venus.insight.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author RanYeah
 * @since 2022/9/7
 */
public class RanYeahAroundInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Ran Yeah ... before ...");
		Object ret = invocation.proceed();
		System.out.println("Ran Yeah ... after ...");
		return ret;
	}
}
