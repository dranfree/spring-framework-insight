package com.venus.insight;

import com.venus.insight.aop.advice.RanYeahAfterAdvice;
import com.venus.insight.aop.advice.RanYeahAroundInterceptor;
import com.venus.insight.aop.advice.RanYeahBeforeAdvice;
import com.venus.insight.lookup.RanYeahBean;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author RanYeah
 * @since 2022/9/7
 */
public class AopTest extends BaseTest {

	@Test
	public void testAOP() {
		RanYeahBean target = new RanYeahBean();

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(target);
		factory.addAdvice(new RanYeahAfterAdvice());
		factory.addAdvice(new RanYeahAroundInterceptor());
		factory.addAdvice(new RanYeahBeforeAdvice());

		RanYeahBean proxy = (RanYeahBean) factory.getProxy();

		proxy.logSelf();
	}
}
