package com.venus.insight;

import com.venus.insight.loadbalance.LoadBalanceHolder;
import org.junit.Test;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
public class InjectTest extends BaseTest {

	@Test
	public void test() {
		getContext().getBean(LoadBalanceHolder.class).doSelect();
	}
}
