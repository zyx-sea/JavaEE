/**
 * 商品实体类
 */
package cn.qd.book.model;

import java.math.BigDecimal;
import java.util.Date;

import cn.qd.book.model.Category;

/**
* @author  July 
* @date 2016/10/14
* @version 1.0 
* @parameter  商品实体类
 */
public class Product implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = -5102917489458854913L;

	private Integer id;
	private Category category;
	private String name;
	private BigDecimal price;
	private String pic;
	private String remark;
	private String xremark;
	private Date date;
	private Boolean commend;
	private Boolean open;

	
	//构造方法
		public Product(Integer id, Category category, String name, BigDecimal price, String pic, String remark,
			String xremark, Date date, Boolean commend, Boolean open) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
		this.pic = pic;
		this.remark = remark;
		this.xremark = xremark;
		this.date = date;
		this.commend = commend;
		this.open = open;
	}

		//get/set方法
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Category getCategory() {
			return category;
		}


		public void setCategory(Category category) {
			this.category = category;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public BigDecimal getPrice() {
			return price;
		}


		public void setPrice(BigDecimal price) {
			this.price = price;
		}


		public String getPic() {
			return pic;
		}


		public void setPic(String pic) {
			this.pic = pic;
		}


		public String getRemark() {
			return remark;
		}


		public void setRemark(String remark) {
			this.remark = remark;
		}


		public String getXremark() {
			return xremark;
		}


		public void setXremark(String xremark) {
			this.xremark = xremark;
		}


		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}


		public Boolean getCommend() {
			return commend;
		}


		public void setCommend(Boolean commend) {
			this.commend = commend;
		}


		public Boolean getOpen() {
			return open;
		}


		public void setOpen(Boolean open) {
			this.open = open;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
}
