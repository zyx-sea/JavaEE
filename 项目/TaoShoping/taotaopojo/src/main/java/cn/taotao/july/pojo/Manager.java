package cn.taotao.july.pojo;

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
public class Manager extends Model<Manager> {

    private static final long serialVersionUID = 1L;

    @TableId("mng_username")
	private String mngUsername;
	@TableField("mng_password")
	private String mngPassword;
	@TableField("mng_name")
	private String mngName;
	@TableField("mng_sex")
	private String mngSex;
	@TableField("mng_phone")
	private String mngPhone;


	public String getMngUsername() {
		return mngUsername;
	}

	public void setMngUsername(String mngUsername) {
		this.mngUsername = mngUsername;
	}

	public String getMngPassword() {
		return mngPassword;
	}

	public void setMngPassword(String mngPassword) {
		this.mngPassword = mngPassword;
	}

	public String getMngName() {
		return mngName;
	}

	public void setMngName(String mngName) {
		this.mngName = mngName;
	}

	public String getMngSex() {
		return mngSex;
	}

	public void setMngSex(String mngSex) {
		this.mngSex = mngSex;
	}

	public String getMngPhone() {
		return mngPhone;
	}

	public void setMngPhone(String mngPhone) {
		this.mngPhone = mngPhone;
	}

	@Override
	protected Serializable pkVal() {
		return this.mngUsername;
	}

}
