package com.qst.chapter03.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ClickNumAction  extends ActionSupport {
	public String execute() {
		// ��ȡActionContext����ͨ���ö������Servlet API
		ActionContext ctx = ActionContext.getContext();
		// ��ȡServletContext���num����
		Integer num = (Integer) ctx.getApplication().get("num");
		// ���num����Ϊnull������num����Ϊ1
			if (num == null) {
				num = 1;
			} else {
				// ��num��1
				num++;
			}
		// ����1���numֵ������application��
		ctx.getApplication().put("num", num);
		return SUCCESS;
	}
}
