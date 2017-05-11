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


    /*登录验证*/
      public String login(){
        User u=userService.check(user.getUsername(),user.getPassword());
        ActionContext ac=ActionContext.getContext();
        Map<String,Object>  session=ac.getSession();
        /*System.out.print(user.getUsername()+"  "+user.getPassword());*/
        if (u != null) {
            session.put("user",u);
            str = "success";
        } else {
            str = "error";
        }
        return str;
    }

    /*管理员登录验证*/
    public String login2(){
        User u=userService.checkadmin(user.getUsername(),user.getPassword());
        ActionContext ac=ActionContext.getContext();
        Map<String,Object>  session=ac.getSession();
        /*System.out.print(user.getUsername()+"  "+user.getPassword());*/
        if (u != null) {
            session.put("user",u);
            str = "success";
        } else {
            str = "error";
        }
        return str;
    }

    /*注册添加*/
    public String  add(){
        try {
            userService.add(user);
            str = "register_success";
            System.out.println("插入成功");
        } catch (Exception e) {
            System.out.println("插入失败");
            /*System.out.println(e.getCause());
            System.out.println(e.getMessage());*/
            str = "register_error";
        }
        System.out.print(user.getUsername()+" "+user.getPassword()+"  "+user.getUsertype());
        return str;
    }

    /*按姓名查询用户*/
    public String query(){
        User u=userService.query(user.getUsername());
        ActionContext ac=ActionContext.getContext();
        Map<String,Object>  session=ac.getSession();
        if (u != null) {
            session.put("user",u);
            str = "query_success";
        } else {
            str = "query_error";
        }
       /* System.out.println(u.getUsername());
        System.out.println(u.getId());
        System.out.println(u.getDate());
        System.out.println(u.getUsertype());*/
        return str;
    }

    /*根據id刪除用户*/
    public String delete(){
        try {
            userService.delete(user.getId());
            System.out.println("刪除成功！");
            str="delete_success";
        }catch (Exception e){
            System.out.println("刪除失敗！");
            str="delete_error";
        }
        System.out.println(user.getId());
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