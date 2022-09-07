package com.venus.insight.aop.advisor;

import com.venus.insight.aop.advice.RanYeahBeforeAdvice;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @author RanYeah
 * @since 2022/9/7
 */
public class RanYeahAdvisor implements PointcutAdvisor {

	@Override
	public Advice getAdvice() {
		return new RanYeahBeforeAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public Pointcut getPointcut() {
		return new StaticMethodMatcherPointcut() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				return "echo".equals(method.getName());
			}
		};
	}
}
