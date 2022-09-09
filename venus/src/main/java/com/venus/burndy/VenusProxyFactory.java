package com.venus.burndy;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;

/**
 * 代理工厂
 *
 * @author RanYeah
 * @since 2022/9/7
 */
public interface VenusProxyFactory<T> {

	void setTarget(T target);

	void setTargetClass(Class<T> targetType);

	void addAdvice(Advice advice);

	void addAdvisor(Advisor advisor);
}
