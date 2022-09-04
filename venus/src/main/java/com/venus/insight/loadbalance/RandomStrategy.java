package com.venus.insight.loadbalance;

import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Component("RandomLoadBalance")
public class RandomStrategy implements LoadBalanceStrategy {

	@Override
	public URL select(List<URL> urlList) {
		System.out.println("random");
		return null;
	}
}
