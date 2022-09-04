package com.venus.insight.loadbalance;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author RanYeah
 * @since 2022/9/4
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Qualifier("RoundRobinLoadBalance")
public @interface RoundRobin {
}
