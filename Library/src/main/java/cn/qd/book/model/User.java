/**
 *用户实体类 
 */
package cn.qd.book.model;
import java.util.HashSet;
import java.util.Set;
import cn.qd.book.model.Forder;

/**
* @author  July 
* @date 2016/10/14
* @version 1.0 
* @parameter  实体类
 */
public class User {
	
	private Integer id;
	private String loginname;
	private String name;
	private String pass;
	private String sex;
	private String phone;
	private Set<Forder> forders = new HashSet<Forder>(0);
	
	
	//构造方法
	public User(Integer id, String loginname, String name, String pass, String sex, String phone, Set<Forder> forders) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.phone = phone;
		this.forders = forders;
	}	
	//	get/set方法


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLoginname() {
		return loginname;
	}


	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Set<Forder> getForders() {
		return forders;
	}


	public void setForders(Set<Forder> forders) {
		this.forders = forders;
	}
	

}
