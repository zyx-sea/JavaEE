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
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    @TableId("users_username")
	private String usersUsername;
	@TableField("users_password")
	private String usersPassword;
	@TableField("users_name")
	private String usersName;
	@TableField("users_sex")
	private String usersSex;
	@TableField("users_phone")
	private String usersPhone;
	@TableField("users_addr")
	private String usersAddr;


	public String getUsersUsername() {
		return usersUsername;
	}

	public void setUsersUsername(String usersUsername) {
		this.usersUsername = usersUsername;
	}

	public String getUsersPassword() {
		return usersPassword;
	}

	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersSex() {
		return usersSex;
	}

	public void setUsersSex(String usersSex) {
		this.usersSex = usersSex;
	}

	public String getUsersPhone() {
		return usersPhone;
	}

	public void setUsersPhone(String usersPhone) {
		this.usersPhone = usersPhone;
	}

	public String getUsersAddr() {
		return usersAddr;
	}

	public void setUsersAddr(String usersAddr) {
		this.usersAddr = usersAddr;
	}

	@Override
	protected Serializable pkVal() {
		return this.usersUsername;
	}

}
