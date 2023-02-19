package com.venus.insight.config;

import com.venus.insight.component.OrderService;
import com.venus.insight.component.impl.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author RanYeah
 * @since 2022/8/30
 */
@EnableAsync
@EnableAspectJAutoProxy
@ComponentScan("com.venus")
@EnableTransactionManagement // TransactionInterceptor
public class AppConfig {

//	@Bean // factory-bean=AppConfig factoryMethod=orderService
//	public OrderService orderService() {
//		return new OrderServiceImpl();
//	}
}
