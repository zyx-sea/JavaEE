package com.qst.chapter03.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction4 extends ActionSupport implements ServletRequestAware {
	/* �û��� */
	private String userName;
	/* ���� */
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

	//����request����
	private HttpServletRequest request;
	//��дServletRequestAware�еķ���
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * ����ҵ���߼�����������ҵ������
	 */
	public String execute() {
		System.out.println("----��¼���û���Ϣ-----");
		System.out.println("�û�����" + userName);
		System.out.println("���룺" + password);
		if (userName.startsWith("qst") && password.length() >= 6) {
			// ���session����
			HttpSession session = request.getSession();
			//���û�����ŵ�session��
			session.setAttribute("CurUser", userName);
			// ���سɹ�ҳ��
			return SUCCESS;
		} else {
			// ����ʧ��ҳ��
			return ERROR;
		}
	}

	// ��дvalidate()����
	public void validate() {
		// ����֤�û�����
		if (this.userName == null || this.userName.equals("")) {
			// ��������Ϣд�뵽Action���FieldErrors��
			// ��ʱStruts 2����Զ�����INPUT��ͼ
			this.addFieldError("userName", "�û�������Ϊ�գ�");
			System.out.println("�û���Ϊ�գ�");
		}
		if (this.password == null || this.password.length() < 6) {
			this.addFieldError("password", "���벻��Ϊ�������볤�Ȳ���С��6");
			System.out.println("���벻��Ϊ�������볤�Ȳ���С��6��");
		}
	}

}
