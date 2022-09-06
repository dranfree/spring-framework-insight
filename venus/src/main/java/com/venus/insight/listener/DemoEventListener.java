package com.venus.insight.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/6
 */
@Component
public class DemoEventListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println("接收到事件：" + event);
	}
}
