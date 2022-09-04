package com.venus.insight.order;

import org.springframework.stereotype.Component;

import javax.annotation.Priority;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Priority(9)
@Component
public class Component2 implements OrderedComponent {

	@Override
	public void echo(String message) {
		System.out.println(getClass().getCanonicalName() + ":" + message);
	}
}
