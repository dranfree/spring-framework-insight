package com.venus.insight.component;

/**
 * 库存服务
 *
 * @author RanYeah
 * @since 2022/8/30
 */
public interface StockService {

	/**
	 * 扣减库存
	 *
	 * @param skuId SKU ID
	 * @param n 数量
	 */
	void deduct(Long skuId, int n);
}
