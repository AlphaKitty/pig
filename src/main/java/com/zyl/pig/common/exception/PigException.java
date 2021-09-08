package com.zyl.pig.common.exception;

/**
 * TODO: PIG异常
 *
 * @author 张友谅
 * @date 15:59 2020/11/7
 **/
public class PigException extends BaseException {

	private static final long serialVersionUID = 8502220091723228335L;

	public PigException(ErrorEnum errorEnum) {
		this(errorEnum, null);
		tag = "pig";
	}

	public PigException(ErrorEnum errorEnum, String errorMessage) {
		super(errorEnum, errorMessage);
		tag = "pig";
	}

}
