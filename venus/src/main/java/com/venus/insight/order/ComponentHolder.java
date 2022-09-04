package com.venus.insight.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Component
public class ComponentHolder {

	@Autowired
	private OrderedComponent component1;

	public void test() {
		component1.echo("Hello World!!!");
	}
}
