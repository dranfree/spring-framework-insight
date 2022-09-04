package com.venus.insight.loadbalance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Component
public class LoadBalanceHolder {

	@Autowired
	@RoundRobin
	private LoadBalanceStrategy loadBalanceStrategy;

	public void doSelect() {
		loadBalanceStrategy.select(Collections.emptyList());
	}
}
