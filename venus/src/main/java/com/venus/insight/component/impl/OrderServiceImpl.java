package com.venus.insight.component.impl;

import com.venus.insight.component.OrderService;
import com.venus.insight.component.StockService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RanYeah
 * @since 2022/8/30
 */
@Service
public class OrderServiceImpl implements OrderService, DisposableBean {

	@Autowired
	private StockService stockService;

	@Override
	public void create(Long userId) {
		System.out.println("创建订单：" + userId);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(getClass().getCanonicalName() + ": 我被关闭了！");
	}
}
