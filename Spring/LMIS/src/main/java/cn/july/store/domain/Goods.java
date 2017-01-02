package cn.july.store.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * <br>
 * create:2016-12-27 10:05
 *
 * @author zhou
 */

public class Goods implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String nm;
	private String unit;
	private Double amount;

	private Store store;
	private Set histories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(String id) {
		this.id = id;
	}

	/** full constructor */
	public Goods(String id, Store store, String name, String nm, String unit,
			Double amount, Set histories) {
		this.id = id;
		this.store = store;
		this.name = name;
		this.nm = nm;
		this.unit = unit;
		this.amount = amount;
		this.histories = histories;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNm() {
		return this.nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Set getHistories() {
		return this.histories;
	}

	public void setHistories(Set histories) {
		this.histories = histories;
	}

}