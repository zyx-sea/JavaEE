package cn.july.store.domain;
/**
 * <br>
 * create:2016-12-27 10:05
 *
 * @author zhou
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String password;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String id) {
		this.id = id;
	}

	/** full constructor */
	public Userinfo(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}