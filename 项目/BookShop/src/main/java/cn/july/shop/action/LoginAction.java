package cn.july.shop.action;

import cn.july.shop.model.User;
import cn.july.shop.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * zhouyaxin<br>
 * create:2016-12-27 19:25
 *
 * @author zhou
 * @version 0.0.1
 */
@Controller
@Scope("prototype")
public class LoginAction  implements ModelDriven<User>  {

    @Resource
    private UserService userService;
    private User user;
    private String str;

  public String login() {
        User u=userService.login(user.getUsername(),user.getPassword());
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> session = ac.getSession();
        if (u != null) {
            session.put("user",u);
            str = "success";
        } else {
            str = "error";
        }
        return str;
    }

    @Override
    public User getModel() {
      if (user==null){
          user = new User();
      }
        return user;
    }
}

