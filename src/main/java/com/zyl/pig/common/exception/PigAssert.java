package com.zyl.pig.common.exception;

/**
 * TODO: PIG断言
 *
 * @author 张友谅
 * @date 15:26 2020/11/7
 **/
public class PigAssert {

	public static void assertNotNull(Object obj, ErrorEnum errorEnum) throws PigException {
		if (obj == null) {
			throw new PigException(errorEnum);
		}
	}

	public static void assertNotEmpty(Object obj, ErrorEnum errorEnum) throws PigException {
		if (obj == null || "".equals(obj)) {
			throw new PigException(errorEnum);
		}
	}

}
