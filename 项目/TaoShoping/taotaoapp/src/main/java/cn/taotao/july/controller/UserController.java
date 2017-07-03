package cn.taotao.july.controller;

import cn.taotao.july.pojo.Users;
import cn.taotao.july.service.UserService;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <br>
 * create:2017-04-27 16:49
 *
 * @author zhou
 */

@Controller
@Scope("prototype")
public class UserController {
    @Autowired
    private UserService userService;


    /*登出*/
    @RequestMapping("/loginout")
    public String  loginout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "/login";
     }

    /*登录*/
    @RequestMapping("/denglu")
    @ResponseBody
    public Map<String,Object> denglu(@ModelAttribute("user") Users user, HttpSession session){
        Users u=userService.findUserByName(user);
        Map<String,Object> map = new HashMap<>();
        if(u!=null&&u.getUsersPassword().equals(user.getUsersPassword())){
            session.setAttribute("user",user);
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }
        return  map;
    }
    /*判断是否已登录*/
    @RequestMapping("/adjustlogin")
    @ResponseBody
    public Map<String,Object> adjustlogin(HttpSession session){
        Map<String,Object> userinfo = new HashMap<>();
        userinfo.put("user",session.getAttribute("user"));
        return  userinfo;
    }
    /*注册*/
    @RequestMapping("/register")
    public  String register(Users users){
        int userTotal=0;
        if (users.getUsersName()==null){
            userTotal=userService.insertUser(users);
        }else{
            userTotal=userService.update(users);
        }
        if (userTotal>0){
            return "index";
        }else {
            return  "login";
        }
    }

    /*按照姓名查找用户*/
    @RequestMapping("/findUserByname")
    public String findUserByUsername(Users user,HttpSession session){
        if (userService.findUserByName(user)!=null){
            session.setAttribute("users",userService.findUserByName(user));
            return "usersCheck";
        }else{
            return "usersQuery";
        }
    }
    /*显示找到的结果*/
    @RequestMapping("/showusers")
    @ResponseBody
    public Map<String,Object> showusers(HttpSession session){
        Map<String,Object> userinfo = new HashMap<>();
        userinfo.put("users",session.getAttribute("users"));
        return  userinfo;
    }

    /*显示所有用户信息*/
    @RequestMapping("/getall")
    @ResponseBody
    public List<Users> getAll(){
        return userService.getAllUsers();
    }

    /*插入用户*/
    @RequestMapping("/insertuser")
    public String  insert(Users users){
        int userTotal=0;
        if (users.getUsersName()!=null){
            userTotal=userService.insertUser(users);
        }else{
            userTotal=userService.update(users);
        }
        if (userTotal>0){
            return "usersQuery";
        }else {
            return  "usersAdd";
        }
    }
    /*删除用户*/
    @RequestMapping("/deleteuser")
    @ResponseBody
    public Map<String,Boolean>  delete(@ModelAttribute("user")Users users){
        System.out.println(users.getUsersName());
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        if(userService.delete(users)>0){
            map.put("msg",true);
        }else {
            map.put("msg",false);
        }
        return map;
    }

    /*分页*/
    public Page selectPage(@PathVariable Integer page, @PathVariable Integer rows){
        return userService.selectUser(page, rows);
    }


}
