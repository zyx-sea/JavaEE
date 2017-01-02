package cn.july.store.domain;

import java.util.HashSet;
import java.util.Set;
/**
 * <br>
 * create:2016-12-27 10:05
 *
 * @author zhou
 */

public class Store implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String addr;
	private String manager;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** minimal constructor */
	public Store(String id) {
		this.id = id;
	}

	/** full constructor */
	public Store(String id, String name, String addr, String manager,
			Set goodses) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.manager = manager;
		this.goodses = goodses;
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

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}