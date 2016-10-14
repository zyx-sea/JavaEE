/**
 * 
 */
package cn.qd.book.model;

import java.util.HashSet;
import java.util.Set;

import cn.qd.book.model.Forder;

/** 
* @author  July 
* @date 2016/10/14
* @version 1.0 
* @parameter  
*/
public class Status {

	private Integer id;
	private String status;
	private Set<Forder> forders = new HashSet<Forder>(0);
	
	//构造方法
	public Status(Integer id, String status, Set<Forder> forders) {
		super();
		this.id = id;
		this.status = status;
		this.forders = forders;
	}

	//get/set方法
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Forder> getForders() {
		return forders;
	}

	public void setForders(Set<Forder> forders) {
		this.forders = forders;
	}
	
	
	
	
}
