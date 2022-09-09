package com.venus.burndy.aop;

import java.lang.reflect.Method;

/**
 * @author RanYeah
 * @since 2022/9/8
 */
public interface ThrowsAdvice<X extends Throwable> extends Advice {

	void afterThrow(Object target, Method method, Object[] args, X cause);
}
