package com.venus.insight;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
public abstract class BaseTest {

	protected ConfigurableApplicationContext getContext() {
		return new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
