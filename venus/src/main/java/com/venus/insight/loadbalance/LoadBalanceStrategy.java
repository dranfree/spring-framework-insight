package com.venus.insight.loadbalance;

import java.net.URL;
import java.util.List;

/**
 * 负载均衡策略
 *
 * @author RanYeah
 * @since 2022/9/4
 */
public interface LoadBalanceStrategy {

	URL select(List<URL> urlList);
}
