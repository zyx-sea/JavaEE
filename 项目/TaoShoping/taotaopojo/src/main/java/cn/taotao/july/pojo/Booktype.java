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
@TableName("book_type")
public class BookType extends Model<BookType> {

    private static final long serialVersionUID = 1L;

	@TableId(value="bt_id", type= IdType.AUTO)
	private Integer btId;
	@TableField("bt_name")
	private String btName;
	@TableField("bt_mark")
	private String btMark;


	public Integer getBtId() {
		return btId;
	}

	public void setBtId(Integer btId) {
		this.btId = btId;
	}

	public String getBtName() {
		return btName;
	}

	public void setBtName(String btName) {
		this.btName = btName;
	}

	public String getBtMark() {
		return btMark;
	}

	public void setBtMark(String btMark) {
		this.btMark = btMark;
	}

	@Override
	protected Serializable pkVal() {
		return this.btId;
	}

}
