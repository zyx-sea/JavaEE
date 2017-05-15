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
public class Book extends Model<Book> {

    private static final long serialVersionUID = 1L;

    @TableId("book_no")
	private String bookNo;
	@TableField("book_name")
	private String bookName;
	@TableField("book_price")
	private BigDecimal bookPrice;
	@TableField("book_author")
	private String bookAuthor;
	@TableField("book_pub")
	private String bookPub;
	@TableField("book_count")
	private Integer bookCount;
	@TableField("book_date")
	private Date bookDate;
	@TableField("book_pic")
	private String bookPic;
	@TableField("book_des")
	private String bookDes;
	@TableField("mng_username")
	private String mngUsername;
	@TableField("bt_id")
	private Integer btId;


	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public BigDecimal getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(BigDecimal bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPub() {
		return bookPub;
	}

	public void setBookPub(String bookPub) {
		this.bookPub = bookPub;
	}

	public Integer getBookCount() {
		return bookCount;
	}

	public void setBookCount(Integer bookCount) {
		this.bookCount = bookCount;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public String getBookPic() {
		return bookPic;
	}

	public void setBookPic(String bookPic) {
		this.bookPic = bookPic;
	}

	public String getBookDes() {
		return bookDes;
	}

	public void setBookDes(String bookDes) {
		this.bookDes = bookDes;
	}

	public String getMngUsername() {
		return mngUsername;
	}

	public void setMngUsername(String mngUsername) {
		this.mngUsername = mngUsername;
	}

	public Integer getBtId() {
		return btId;
	}

	public void setBtId(Integer btId) {
		this.btId = btId;
	}

	@Override
	protected Serializable pkVal() {
		return this.bookNo;
	}

}
