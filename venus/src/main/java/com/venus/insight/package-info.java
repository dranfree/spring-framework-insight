/**
 * 一些重要入口
 *
 * @author RanYeah
 * @see org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean(String, RootBeanDefinition, Object[]) Bean创建
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor#postProcessBeanDefinitionRegistry(BeanDefinitionRegistry) BeanDefinition扫描和注册
 * @see org.springframework.context.support.AbstractApplicationContext#registerListeners() 注册事件监听器
 * @see org.springframework.context.event.EventListenerMethodProcessor 事件监听方法扫描
 * @see org.springframework.context.support.ApplicationListenerDetector 事件监听器扫描
 * @see org.springframework.beans.factory.support.CglibSubclassingInstantiationStrategy.LookupOverrideMethodInterceptor @Lookup注解拦截器
 * @see org.springframework.beans.factory.support.ConstructorResolver#instantiateUsingFactoryMethod(String, RootBeanDefinition, Object[]) @Bean注解处理
 * @see org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator Advisor切面增强后置处理器
 * @see org.springframework.aop.framework.AbstractAdvisingBeanPostProcessor @Async/@Valid切面增强后置处理器
 * @since 2022/9/5
 */
package com.venus.insight;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
