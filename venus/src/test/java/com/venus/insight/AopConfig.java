//package com.venus.insight;
//
//import com.venus.insight.aop.advice.RanYeahBeforeAdvice;
//import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
//import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
//import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
//import org.springframework.aop.support.DefaultPointcutAdvisor;
//import org.springframework.context.annotation.*;
//
///**
// * @author RanYeah
// * @since 2022/9/7
// */
//@Configuration
//@EnableAspectJAutoProxy
////@Import(AnnotationAwareAspectJAutoProxyCreator.class)
//public class AopConfig {
//
//	// BeanPostProcessor
//	@Bean
//	public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
//		BeanNameAutoProxyCreator creator = new BeanNameAutoProxyCreator();
//		creator.setBeanNames("ran*");
//		creator.setInterceptorNames("ranYeahAfterAdvice");
//		return creator;
//	}
//
//	@Bean
//	public DefaultPointcutAdvisor defaultPointcutAdvisor() {
//		DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
////		advisor.setPointcut();
//		advisor.setAdvice(new RanYeahBeforeAdvice());
//		return advisor;
//	}
//
//	// 可以直接用 @Import 注解导入
//	@Bean
//	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//		// 扫描所有的advisor，也是一个 BeanPostProcessor
//		return new DefaultAdvisorAutoProxyCreator();
//	}
//}
