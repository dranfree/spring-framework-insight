package com.dingdong.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author GuanShan
 * @since 2020.12.08
 */
public class InitializationLifecycleTests {

    @Test
    public void testInitialize() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("application bootstrap!");
        System.out.println("component: " + context.getBean(InitializationBean.class));
    }

    @Configuration
    @ComponentScan("com.dingdong")
    public static class Config {

    }
}