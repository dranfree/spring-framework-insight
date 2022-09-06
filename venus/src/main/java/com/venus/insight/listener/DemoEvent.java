package com.venus.insight.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author RanYeah
 * @since 2022/9/6
 */
public class DemoEvent extends ApplicationEvent {

	private static final long serialVersionUID = -459246675276566712L;

	public DemoEvent(Object source) {
		super(source);
	}
}
