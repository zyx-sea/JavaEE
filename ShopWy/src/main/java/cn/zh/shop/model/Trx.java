package cn.zh.shop.model;

/**
 * 交易记录实现类<br>
 * create:2016-11-18 8:38
 *
 * @author zhou
 * @version 1.0
 */
public class Trx {

    private Integer id;//主键id
    private  Integer contentId;//内容id
    private Integer personId;//用户id
    private Integer price;//购买价格
    private String time;//购买时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
