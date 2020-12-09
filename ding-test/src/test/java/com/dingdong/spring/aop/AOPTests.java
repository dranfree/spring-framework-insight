package com.dingdong.spring.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author GuanShan
 * @since 2020.12.09
 */
public class AOPTests {

    @Test
    public void test() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class);
        EchoService echoService = context.getBean(EchoService.class);
        echoService.echo("hello aop!");
    }

    @Configuration
    @ComponentScan("com.dingdong")
    @EnableAspectJAutoProxy
    static class Config {

    }
}