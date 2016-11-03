package cn.qd.book.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 订单状态pojo类<br>
 * create:2016-10-23 18:55
 *
 * @author zhou
 * @version 1.0
 */
public class Status {

    private Integer id;
    private String status;
    private Set<Forder> forders = new HashSet<Forder>(0);


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Forder> getForders() {
        return forders;
    }

    public void setForders(Set<Forder> forders) {
        this.forders = forders;
    }
}
