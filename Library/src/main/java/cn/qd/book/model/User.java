package cn.qd.book.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户pojo类<br>
 * create:2016-10-23 18:51
 *
 * @author zhou
 * @version 1.0
 */
public class User {

    private Integer id;
    private String name;
    private String pass;
    private String sex;
    private String phone;
    private Set<Forder> forders = new HashSet<Forder>(0);

    public User(Integer id, String name, String pass, String sex, String phone, Set<Forder> forders) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.sex = sex;
        this.phone = phone;
        this.forders = forders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Forder> getForders() {
        return forders;
    }

    public void setForders(Set<Forder> forders) {
        this.forders = forders;
    }
}
