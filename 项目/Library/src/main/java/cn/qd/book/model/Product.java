package cn.qd.book.model;

import java.util.Date;

/**
 * 商品pojo类<br>
 * create:2016-10-23 18:56
 *
 * @author zhou
 * @version 1.0
 */
public class Product {
    private int id;
    private  String name;
    private  String price;
    private  String pic;
    private  String remark;
    private  String  xremark;
    private  Date  date;
    private int open;
    private int cid;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
