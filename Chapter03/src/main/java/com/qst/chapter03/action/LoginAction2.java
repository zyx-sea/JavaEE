package com.qst.chapter03.action;

import com.opensymphony.xwork2.Action;

public class LoginAction2 implements Action{
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

	/**
	 * ����ҵ���߼�����������ҵ������
	 */
	public String execute() {
		System.out.println("----��¼���û���Ϣ-----");
		System.out.println("�û�����" + userName);
		System.out.println("���룺" + password);
		if (userName.startsWith("qst") && password.length() >= 6) {
			// ���سɹ�ҳ��
			return SUCCESS;
		} else {
			// ����ʧ��ҳ��
			return ERROR;
		}
	}

}

