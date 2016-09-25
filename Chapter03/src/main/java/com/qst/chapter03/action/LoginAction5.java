package com.qst.chapter03.action;



public class LoginAction5 {
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
			return "success";
		} else {
			// 抛出异常
			throw new RuntimeException("用户登录失败！");
		}
	}

}
