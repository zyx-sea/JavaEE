package cn.taotao.july.pojo;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhou
 * @since 2017-05-15
 */
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

    @TableId("orders_no")
	private String ordersNo;
	@TableField("users_username")
	private String usersUsername;
	@TableField("orders_date")
	private Date ordersDate;
	@TableField("orders_addr")
	private String ordersAddr;
	@TableField("orders_rename")
	private String ordersRename;
	@TableField("orders_phone")
	private String ordersPhone;
	@TableField("orders_price")
	private BigDecimal ordersPrice;


	public String getOrdersNo() {
		return ordersNo;
	}

	public void setOrdersNo(String ordersNo) {
		this.ordersNo = ordersNo;
	}

	public String getUsersUsername() {
		return usersUsername;
	}

	public void setUsersUsername(String usersUsername) {
		this.usersUsername = usersUsername;
	}

	public Date getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(Date ordersDate) {
		this.ordersDate = ordersDate;
	}

	public String getOrdersAddr() {
		return ordersAddr;
	}

	public void setOrdersAddr(String ordersAddr) {
		this.ordersAddr = ordersAddr;
	}

	public String getOrdersRename() {
		return ordersRename;
	}

	public void setOrdersRename(String ordersRename) {
		this.ordersRename = ordersRename;
	}

	public String getOrdersPhone() {
		return ordersPhone;
	}

	public void setOrdersPhone(String ordersPhone) {
		this.ordersPhone = ordersPhone;
	}

	public BigDecimal getOrdersPrice() {
		return ordersPrice;
	}

	public void setOrdersPrice(BigDecimal ordersPrice) {
		this.ordersPrice = ordersPrice;
	}

	@Override
	protected Serializable pkVal() {
		return this.ordersNo;
	}

}
