package cn.july.shop.action;

import java.util.HashMap;
import java.util.Map;

/**
 * BUY<br>
 * create:2016-12-30 15:57
 *
 * @author zhou
 * @version 0.0.1
 */
public class BuyAction {

    private Map<String, Object> root = new HashMap<>();

    public Map<String, Object> getRoot() {
        return root;
    }

    public void setRoot(Map<String, Object> root) {
        this.root = root;
    }

    public String buy(){
        this.root.put("message","购买成功！");
        return "message";
    }

}
