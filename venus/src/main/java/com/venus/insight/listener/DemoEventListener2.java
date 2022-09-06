package com.venus.insight.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/6
 */
@Component
public class DemoEventListener2 {

	@EventListener
	public void onDemoEvent(DemoEvent event) {
		System.out.println("@EventListener监听到事件：" + event);
	}
}
