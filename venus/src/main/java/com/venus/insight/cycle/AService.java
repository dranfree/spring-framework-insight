package com.venus.insight.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Component
public class AService {

	@Autowired
	private BService bService;

//	@Async
	public void testA() {
		System.out.println("testA");
	}
}
