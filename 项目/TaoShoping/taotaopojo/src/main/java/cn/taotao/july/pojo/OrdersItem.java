package cn.taotao.july.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhou
 * @since 2017-05-15
 */
@TableName("orders_item")
public class OrdersItem extends Model<OrdersItem> {

    private static final long serialVersionUID = 1L;

	@TableId(value="oi_id", type= IdType.AUTO)
	private Integer oiId;
	@TableField("orders_no")
	private String ordersNo;
	@TableField("book_no")
	private String bookNo;
	@TableField("oi_bcount")/*购买数量*/
	private Integer oiBcount;


	public Integer getOiId() {
		return oiId;
	}

	public void setOiId(Integer oiId) {
		this.oiId = oiId;
	}

	public String getOrdersNo() {
		return ordersNo;
	}

	public void setOrdersNo(String ordersNo) {
		this.ordersNo = ordersNo;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public Integer getOiBcount() {
		return oiBcount;
	}

	public void setOiBcount(Integer oiBcount) {
		this.oiBcount = oiBcount;
	}

	@Override
	protected Serializable pkVal() {
		return this.oiId;
	}

}
