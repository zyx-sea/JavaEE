package cn.july.shop.action;

import cn.july.shop.model.User;
import cn.july.shop.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

/**
 * zhouyaxin<br>
 * create:2016-12-27 19:25
 *
 * @author zhou
 * @version 0.0.1
 */
public class LoginAction  implements ModelDriven<User>  {

    private User user = new User();

  public String login() {
        String str = null;
        User u = new UserServiceImpl().login(user.getUsername(), user.getPassword());
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> session = ac.getSession();
        if (u != null) {
            session.put("username", u.getUsername());
            session.put("id",u.getId());
            str = "success";
        } else {
            str = "error";
        }
        return str;
    }

    @Override
    public User getModel() {
        return user;
    }
}

