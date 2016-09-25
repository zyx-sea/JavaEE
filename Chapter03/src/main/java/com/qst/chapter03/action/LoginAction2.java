package com.qst.chapter03.action;

import com.opensymphony.xwork2.Action;

public class LoginAction2 implements Action{
	/* 用户名 */
	private String userName;
	/* 密码 */
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 调用业务逻辑方法，控制业务流程
	 */
	public String execute() {
		System.out.println("----登录的用户信息-----");
		System.out.println("用户名：" + userName);
		System.out.println("密码：" + password);
		if (userName.startsWith("qst") && password.length() >= 6) {
			// 返回成功页面
			return SUCCESS;
		} else {
			// 返回失败页面
			return ERROR;
		}
	}

}

