package cn.qd.book.model;

/**
 * 管理员pojo类<br>
 * create:2016-10-23 19:27
 *
 * @author zhou
 * @version 1.0
 */
public class Account {

    private Integer id;
    private String name;
    private String pass;

    public Account(Integer id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
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
}
