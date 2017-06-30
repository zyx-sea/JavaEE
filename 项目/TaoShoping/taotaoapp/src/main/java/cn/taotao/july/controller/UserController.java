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
    @RequestMapping("loginout")
    public String  loginout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "/login";
     }

    /*登录*/
    @RequestMapping("/denglu")
    @ResponseBody
    public Map<String,Object> denglu(@ModelAttribute("user") Users user, HttpSession session){
        Users u=userService.findUserByName(user.getUsersUsername());
        Map<String,Object> map = new HashMap<>();
        if(u!=null&&u.getUsersPassword().equals(user.getUsersPassword())){
            session.setAttribute("user",user);
            map.put("msg",true);
            map.put(u.getUsersName(),u);
        }else{
            map.put("msg",false);
        }
        return  map;
    }
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
    /*后台管理员登录*/
    @RequestMapping("/admin")
    public String adminlogin(){
        return "admin/index";
    }
    /*用户管理*/
    @RequestMapping("/userQuery")
    public String userQuery(){
        return "admin/userQuery";
    }
    /*按照姓名查找用户*/
    @RequestMapping("/user/{username}")
    @ResponseBody
    public Users findUserByUsername(@PathVariable  String username){
        return userService.findUserByName(username);
    }
    /*显示所有用户信息*/
    @RequestMapping("/getall")
    @ResponseBody
    public List<Users> getAll(){
        return userService.getAllUsers();
    }
    /*插入用户*/
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String,Boolean> insert(Users users){
        int userTotal=0;
        Map<String,Boolean> map=new HashMap<String, Boolean>() ;
        if (users.getUsersName()==null){
            userTotal=userService.insertUser(users);
        }else{
            userTotal=userService.update(users);
        }
        if (userTotal>0){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;
    }
    /*删除用户*/
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String,Boolean>  delete(@RequestParam(value = "id") String id){
        int userTotal=0;
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        userService.delete(Integer.parseInt(id));
        map.put("success",true);
        return map;
    }
    /*分页*/
    public Page selectPage(@PathVariable Integer page, @PathVariable Integer rows){
        return userService.selectUser(page, rows);
    }

}
