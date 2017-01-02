package cn.july.shop.action;

import cn.july.shop.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * zhouyaxin<br>
 * create:2016-12-27 20:56
 *
 * @author zhou
 * @version 0.0.1
 */
public class ErrorAction {

    private Map<String , Object> root = new HashMap<>();

    public Map<String, Object> getRoot() {
        return root;
    }

    public void setRoot(Map<String, Object> root) {
        this.root = root;
    }

    public String api(){
        User u = new User();
        u.setUsername("wangyue");
        this.root.put("message",u);
        return "message";
    }

}
