package cn.qd.book.model;

/**
 * 购买商品pojo类<br>
 * create:2016-10-23 19:53
 *
 * @author zhou
 * @version 1.0
 */
public class Sorder {


    private int id;
    private Forder forder;
    private Product product;
    private String name;
    private  double price;
    private int number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
