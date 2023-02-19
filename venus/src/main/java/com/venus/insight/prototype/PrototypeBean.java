package com.venus.insight.prototype;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Random
 * @since 2023/2/17
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PrototypeBean {

	public PrototypeBean(String a) {

	}

	public PrototypeBean(String a, String b) {

	}
}
