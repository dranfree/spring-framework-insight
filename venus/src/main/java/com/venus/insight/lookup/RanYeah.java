package com.venus.insight.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author RanYeah
 * @since 2022/9/5
 */
@Component
public class RanYeah {

	public void test() {
		lookUp().logSelf();
	}

	@Lookup
	@RanYeahLookup
	public RanYeahBean lookUp() {
		throw new UnsupportedOperationException();
	}
}
