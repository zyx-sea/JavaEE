package cn.qd.book.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品pojo类<br>
 * create:2016-10-23 18:56
 *
 * @author zhou
 * @version 1.0
 */
public class Product {

    private Integer id;
    private Category category;
    private String name;
    private BigDecimal price;
    private String pic;
    private String remark;
    private String xremark;
    private Date date;
    private int open;

    public Product(Integer id, Category category, String name, BigDecimal price, String pic, String remark, String xremark, Date date, int open) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.pic = pic;
        this.remark = remark;
        this.xremark = xremark;
        this.date = date;
        this.open = open;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getXremark() {
        return xremark;
    }

    public void setXremark(String xremark) {
        this.xremark = xremark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }
}
