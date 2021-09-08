package com.zyl.pig.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorEnum {

	ACTIVE_NOT_FILL(1007, "启用状态不能为空"),

	/**
	 * -----------------------用户部分-------------------------
	 */
	TOKEN_HAS_EXPIRED(10001, "登录过期 请重新登录"),
	USERNAME_NOT_FILL(10001, "用户名不能为空"),
	PASSWORD_NOT_FILL(10002, "密码不能为空"),
	USER_ID_NOT_FILL(10003, "用户id不能为空"),
	TOKEN_BUILD_FAIL(10004, "token构建失败"),
	USER_NOT_EXIST(10005, "用户不存在"),
	SIGN_UP_REPEAT(10006, "不能重复注册"),
	USER_TYPE_NOT_FILL(10008, "用户类型不能为空"),


	/**
	 * -----------------------系统部分-------------------------
	 */
	MENU_NOT_EXIST(20001, "未配置任何菜单"),

	/**
	 * -----------------------社区部分-------------------------
	 */
	FEEDBACK_NOT_SET(30001, "反馈不能为空"),
	FEEDBACK_CONTENT_NOT_FILL(30002, "反馈内容不能为空"),
	FEEDBACK_NAME_NOT_FILL(30003, "昵称不能为空"),
	ARTICLE_NOT_SET(30002, "文章不能为空"),
	ARTICLE_TITLE_NOT_FILL(30002, "文章标题不能为空"),
	ARTICLE_ID_NOT_FILL(30002, "文章id不能为空"),

	COMMENT_NOT_SET(30002, "评论不能为空"),
	COMMENT_TITLE_NOT_FILL(30002, "评论内容不能为空"),

	nouse(-1, "");

	/**
	 * 返回码
	 */
	private final int code;
	/**
	 * 返回消息
	 */
	private final String message;
}
