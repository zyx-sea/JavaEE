package cn.zh.shop.model;

/**
 * 用户实现类<br>
 * create:2016-11-18 8:33
 *
 * @author zhou
 * @version 1.0
 */
public class Person {

    private Integer id;  //主键id
    private String userName;//用户名
    private String password;//密码加密
    private String nickName;//用户昵称
    private Integer userType;//用户类型

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
