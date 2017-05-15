package cn.taotao.july.controller;

import cn.taotao.july.pojo.Users;
import cn.taotao.july.service.UserService;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class UserController {

    @RequestMapping("/admin")
    public String login(){
        return "admin/index";
    }
    @RequestMapping("/userQuery")
    public String userQuery(){
        return "admin/userQuery";
    }
    @Autowired
    private UserService userService;
    @RequestMapping("/user/{username}")
    @ResponseBody
    public Users findUserByUsername(@PathVariable  String username){
        return userService.findUserByName(username);
    }
    @RequestMapping("/getall")
    @ResponseBody
    public List<Users> getAll(){
        return userService.getAllUsers();
    }
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
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String,Boolean>  delete(@RequestParam(value = "id") String id){
        int userTotal=0;
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        userService.delete(Integer.parseInt(id));
        map.put("success",true);
        return map;
    }
    public Page selectPage(@PathVariable Integer page, @PathVariable Integer rows){
        return userService.selectUser(page, rows);
    }

}
