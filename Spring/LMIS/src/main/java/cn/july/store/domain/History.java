package cn.july.store.domain;

/**
 * <br>
 * create:2016-12-27 10:05
 *
 * @author zhou
 */

public class History implements java.io.Serializable {

	// Fields

	private String id;
	private Goods goods;
	private String datetime;
	private String type;
	private Double amount;
	private Double remain;
	private String user;

	// Constructors

	/** default constructor */
	public History() {
	}

	/** minimal constructor */
	public History(String id) {
		this.id = id;
	}

	/** full constructor */
	public History(String id, Goods goods, String datetime, String type,
			Double amount, Double remain, String user) {
		this.id = id;
		this.goods = goods;
		this.datetime = datetime;
		this.type = type;
		this.amount = amount;
		this.remain = remain;
		this.user = user;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getDatetime() {
		return this.datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getRemain() {
		return this.remain;
	}

	public void setRemain(Double remain) {
		this.remain = remain;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}