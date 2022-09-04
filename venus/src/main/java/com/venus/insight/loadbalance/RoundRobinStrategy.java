package com.venus.insight.loadbalance;

import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Component("RoundRobinLoadBalance")
public class RoundRobinStrategy implements LoadBalanceStrategy {

	@Override
	public URL select(List<URL> urlList) {
		System.out.println("round robin");
		return null;
	}
}
