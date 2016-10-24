package cn.qd.mybatis.pojo;

import java.util.Date;

/**
 * @author July
 * @version 1.0
 * @date 2016/10/21
 * @Description 用户实体类
 */
public class User {

    private int id;
    private String username;
    private Date birthday;
    private String address;
    private String Sex;

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", address=" + address + "]";
    }

}
