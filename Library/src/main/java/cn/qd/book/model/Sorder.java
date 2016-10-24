package cn.qd.book.model;

import java.math.BigDecimal;

/**
 * 购买商品pojo类<br>
 * create:2016-10-23 19:53
 *
 * @author zhou
 * @version 1.0
 */
public class Sorder {


    private Integer id;
    private Forder forder;
    private Product product;
    private String name;
    private BigDecimal price;
    private Integer number;

    public Sorder(Integer id, Forder forder, Product product, String name, BigDecimal price, Integer number) {
        this.id = id;
        this.forder = forder;
        this.product = product;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Forder getForder() {
        return forder;
    }

    public void setForder(Forder forder) {
        this.forder = forder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
