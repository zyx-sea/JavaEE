package cn.qd.book.model;

import cn.qd.book.model.Account;

/**
* @author  July 
* @date 2016/10/14
* @version 1.0 
* @parameter  ��Ʒ����ʵ����
 */
public class Category {
	
	private Integer id;
	private Account account;
	private String type;
	private Boolean hot;
	//���췽��
	public Category(Integer id, cn.qd.book.model.Account account, String type, Boolean hot) {
		super();
		this.id = id;
		this.account = account;
		this.type = type;
		this.hot = hot;
	}
	//get/set����
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getHot() {
		return hot;
	}
	public void setHot(Boolean hot) {
		this.hot = hot;
	}
	
	
}
