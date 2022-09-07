package com.venus.insight;

import com.venus.insight.aop.advice.RanYeahAfterAdvice;
import com.venus.insight.aop.advice.RanYeahAroundInterceptor;
import com.venus.insight.aop.advice.RanYeahBeforeAdvice;
import com.venus.insight.aop.advisor.RanYeahAdvisor;
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

		// Advisor = Pointcut + Advice，可以绑定某些方法
		factory.addAdvisor(new RanYeahAdvisor());

		RanYeahBean proxy = (RanYeahBean) factory.getProxy();

		proxy.logSelf();

		proxy.echo("我爱你");
	}
}
