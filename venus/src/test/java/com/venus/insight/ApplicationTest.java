package com.venus.insight;

import com.venus.insight.component.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author RanYeah
 * @since 2022/8/30
 */
//@ContextConfiguration(classes = AppConfig.class)
//@RunWith(SpringRunner.class)
public class ApplicationTest {

	@Test
	public void test() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.create(1L);
	}
}
