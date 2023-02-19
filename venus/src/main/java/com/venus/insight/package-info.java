/**
 * 一些重要入口
 *
 * @author RanYeah
 * @see org.springframework.context.annotation.ClassPathBeanDefinitionScanner#scan(String...) 扫描bean的入口
 * @see org.springframework.context.support.AbstractApplicationContext#refresh() ApplicationContext启动入口模板方法
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor#postProcessBeanDefinitionRegistry(BeanDefinitionRegistry) BeanFactory后置处理器扫描所有注解配置的bean类信息
 * @see org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean(String, RootBeanDefinition, Object[]) Bean创建
 * @see org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#determineConstructorsFromBeanPostProcessors(Class, String) 推断构造方法
 * @see org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor 实例化前/实例化后
 * @see org.springframework.beans.factory.config.BeanPostProcessor 初始化前/初始化后
 * @see org.springframework.context.support.AbstractApplicationContext#registerListeners() 注册事件监听器
 * @see org.springframework.context.event.EventListenerMethodProcessor 事件监听方法扫描
 * @see org.springframework.context.support.ApplicationListenerDetector 事件监听器扫描
 * @see org.springframework.beans.factory.support.CglibSubclassingInstantiationStrategy.LookupOverrideMethodInterceptor @Lookup注解拦截器
 * @see org.springframework.beans.factory.support.ConstructorResolver#instantiateUsingFactoryMethod(String, RootBeanDefinition, Object[]) @Bean注解处理
 * @see org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator Advisor切面增强后置处理器
 * @see org.springframework.aop.framework.AbstractAdvisingBeanPostProcessor @Async/@Valid切面增强后置处理器
 * @see org.springframework.transaction.interceptor.TransactionInterceptor 事务AOP拦截器
 * @see org.springframework.web.servlet.DispatcherServlet SpringMVC请求处理的入口，前端控制器，核心调度器。加载一个独立的Spring容器。
 * @see org.springframework.web.context.ContextLoaderListener 启动SpringMVC容器
 * @see javax.servlet.ServletContainerInitializer Servlet3.0提供的SPI，用于替代xml配置。
 * @since 2022/9/5
 */
package com.venus.insight;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
