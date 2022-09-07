package com.venus.insight.lookup;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @author RanYeah
 * @since 2022/9/7
 */
public class RanYeahLookupProxyFactory {

	public static Object getProxy(Object target, BeanFactory beanFactory) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallbackFilter(method -> {
			if (method.isAnnotationPresent(RanYeahLookup.class)) {
				return 1;
			} else {
				return 0;
			}
		});
		enhancer.setCallbacks(new Callback[]{
				NoOp.INSTANCE,
				(MethodInterceptor) (proxy, method, args, methodProxy) -> {
					Class<?> beanType = method.getReturnType();
					return beanFactory.getBean(beanType);
				}
		});
		return enhancer.create();
	}

	public static Object getSpringProxy(Object target) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(target);
		return null;
	}
}
