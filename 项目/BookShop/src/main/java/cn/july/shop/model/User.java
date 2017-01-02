package cn.july.shop.model;

/**
 * zhouyaxin<br>
 * create:2016-12-27 19:16
 *
 * @author zhou
 * @version 0.0.1
 */
public class User {

    private String username;
    private String password;
    private Integer id;
    private Integer userType;

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
       return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
       return this.password;
    }

}
