package com.venus.insight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author RanYeah
 * @since 2022/8/30
 */
@EnableAsync
@EnableAspectJAutoProxy
@ComponentScan("com.venus")
public class AppConfig {


}
