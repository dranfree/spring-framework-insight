package com.venus.insight.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Component
public class BService {

	@Autowired
	private AService aService;


	public void testB() {
		System.out.println("testB");
	}
}
