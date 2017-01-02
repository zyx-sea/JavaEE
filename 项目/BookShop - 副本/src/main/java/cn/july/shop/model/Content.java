package cn.july.shop.model;

/**
 * 内容实现类<br>
 * create:2016-11-18 8:36
 *
 * @author zhou
 * @version 1.0
 */
public class Content {

    private Integer id;  //主键id
    private  Integer price;//当前价格
    private  String title;//标题
    private String  icon;//图片
    private String abstracts; //摘要
    private String text;//正文


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}