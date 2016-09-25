package com.qst.chapter03.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ClickNumAction  extends ActionSupport {
	public String execute() {
		// 获取ActionContext对象，通过该对象访问Servlet API
		ActionContext ctx = ActionContext.getContext();
		// 获取ServletContext里的num属性
		Integer num = (Integer) ctx.getApplication().get("num");
		// 如果num属性为null，设置num属性为1
			if (num == null) {
				num = 1;
			} else {
				// 将num加1
				num++;
			}
		// 将加1后的num值保存在application中
		ctx.getApplication().put("num", num);
		return SUCCESS;
	}
}
