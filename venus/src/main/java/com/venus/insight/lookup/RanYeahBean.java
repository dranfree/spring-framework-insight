package com.venus.insight.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/5
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RanYeahBean {

	public void logSelf() {
		System.out.println(this);
	}

	public void echo(String message) {
		System.out.println(message);
	}
}
