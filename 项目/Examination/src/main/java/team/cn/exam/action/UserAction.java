package team.cn.exam.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import team.cn.exam.model.User;
import team.cn.exam.service.UserService;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <br>
 * create:2017-04-09 21:55
 *
 * @author zhou
 */
@Controller
@Scope("prototype")
public class UserAction implements ModelDriven<User> {

    @Resource
    private UserService userService;
    private User user;
    private String str;

    public String login(){
        User u=userService.check(user.getUsername(),user.getPassword());
        ActionContext ac=ActionContext.getContext();
        Map<String,Object>  session=ac.getSession();
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