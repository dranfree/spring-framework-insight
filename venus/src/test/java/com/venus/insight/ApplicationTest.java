package com.venus.insight;

import com.venus.insight.component.OrderService;
import com.venus.insight.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		context.registerShutdownHook();
		OrderService orderService = context.getBean(OrderService.class);
		orderService.create(1L);
		context.close();
	}

	@Test
	public void test_destroy() {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.create(1L);
		context.close(); // 手动调用close()方法会触发关闭事件，回调Bean销毁方法。
	}

	@Test
	public void test_destroy_hook() {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.registerShutdownHook(); // 手动注册JVM关闭钩子也可以达到上面的效果
		OrderService orderService = context.getBean(OrderService.class);
		orderService.create(1L);
	}
}
