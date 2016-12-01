package cn.qd.book.model;

/**
 * 商品类pojo类<br>
 * create:2016-10-23 19:01
 *
 * @author zhou
 * @version 1.0
 */
public class Category {

    private Integer id;
    private Account account;
    private String type;
    private Boolean hot;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }
}
