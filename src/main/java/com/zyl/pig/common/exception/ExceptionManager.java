package com.zyl.pig.common.exception;

import com.zyl.pig.common.base.Response;
import com.zyl.pig.common.base.ResponseUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j2
@Component
@ControllerAdvice
public class ExceptionManager {

	/**
	 * 业务异常
	 *
	 * @param e BaseException
	 * @return Response
	 */
	@ExceptionHandler(BaseException.class)
	@ResponseBody
	public Response handler(BaseException e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return ResponseUtil.error(e.getCode(), "业务异常: " + e.getMessage(), null);
	}

	/**
	 * 字段缺失异常
	 *
	 * @param e MissingServletRequestParameterException
	 * @return Response
	 */
	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseBody
	public Response handler(MissingServletRequestParameterException e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return ResponseUtil.error(0, "参数缺失异常: " + e.getMessage(), null);
	}

	/**
	 * 空指针异常
	 *
	 * @param e NullPointerException
	 * @return Response
	 */
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public Response handler(NullPointerException e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return ResponseUtil.error(0, "空指针异常: " + e.getMessage(), null);
	}

	/**
	 * 类型不支持异常
	 *
	 * @param e HttpRequestMethodNotSupportedException
	 * @return Response
	 */
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseBody
	public Response handler(HttpRequestMethodNotSupportedException e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return ResponseUtil.error(0, "类型不支持异常: " + e.getMessage(), null);
	}

	/**
	 * 类型转换异常
	 *
	 * @param e ClassCastException
	 * @return Response
	 */
	@ExceptionHandler(ClassCastException.class)
	@ResponseBody
	public Response handler(ClassCastException e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return ResponseUtil.error(0, "类型转换异常: " + e.getMessage(), null);
	}

	/**
	 * 未知异常
	 *
	 * @param e Exception
	 * @return Exception
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Response handler(Exception e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return ResponseUtil.error(0, "未知异常: " + e.getMessage(), null);
	}

}
