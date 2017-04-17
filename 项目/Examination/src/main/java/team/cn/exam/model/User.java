package team.cn.exam.model;

import java.sql.Date;

/**
 * 用户类<br>
 * create:2017-04-09 20:33
 *
 * @author zhou
 * @version 1.0
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer usertype; //用户类型
    private Date date;//存储时间

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }
}
