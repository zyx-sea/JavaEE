package cn.qd.book.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单表pojo类<br>
 * create:2016-10-23 19:52
 *
 * @author zhou
 * @version 1.0
 */
public class Forder {

    private Integer id;
    private User user;
    private Status status;
    private String name;
    private String phone;
    private String remark;
    private Date date;
    private BigDecimal total;
    private String post;
    private String address;
    private List<Sorder> sorders = new ArrayList<Sorder>();

    public Forder(Integer id, User user, Status status, String name, String phone, String remark, Date date, BigDecimal total, String post, String address, List<Sorder> sorders) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.name = name;
        this.phone = phone;
        this.remark = remark;
        this.date = date;
        this.total = total;
        this.post = post;
        this.address = address;
        this.sorders = sorders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Sorder> getSorders() {
        return sorders;
    }

    public void setSorders(List<Sorder> sorders) {
        this.sorders = sorders;
    }
}
