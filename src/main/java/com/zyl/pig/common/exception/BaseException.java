package com.zyl.pig.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.util.StringUtils;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends Exception {

	private static final long serialVersionUID = 2880602794035879607L;

	protected String tag;
	private int code;
	private String message;

	public BaseException(ErrorEnum errorEnum) {
		int code = errorEnum.getCode();
		String message = errorEnum.getMessage();
		this.code = code;
		this.message = message;
	}

	public BaseException(ErrorEnum errorEnum, String errorMessage) {
		int code = errorEnum.getCode();
		String message = errorEnum.getMessage();
		this.code = code;
		this.message = StringUtils.hasText(errorMessage) ? errorMessage : message;
	}

}
