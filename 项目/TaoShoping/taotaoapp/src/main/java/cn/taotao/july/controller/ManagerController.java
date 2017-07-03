package cn.taotao.july.controller;

import cn.taotao.july.pojo.Manager;
import cn.taotao.july.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 管理员页面<br>
 * create:2017-06-30 10:01
 *
 * @author zhou
 */

@Controller
public class ManagerController {
    @Autowired
    private  ManagerService managerService;
    /*后台管理员登录*/
    @RequestMapping("/admin")
    public String adminlogin(){
        return "admin/login";
    }

    /*管理员登录验证*/
    @RequestMapping("/managerlogin")
    public String managerlogin(@ModelAttribute("manager") Manager manager, HttpSession session){
        Manager m=managerService.findManagerByname(manager.getMngUsername());
        Map<String,Object> map=new HashMap<>();
        if (m!=null&&m.getMngPassword().equals(manager.getMngPassword())){
            session.setAttribute("manager",m);
            return "admin/index";
        }else{
            return "admin/login";
        }
    }
    /*判断是否登陆*/
    @RequestMapping("/adjustmanagerlogin")
    @ResponseBody
    public Map<String,Object> adjustlogin(HttpSession session){
        Map<String,Object> managerinfo = new HashMap<>();
        managerinfo.put("manager",session.getAttribute("manager"));
        return  managerinfo;
    }
    /*登出*/
    @RequestMapping("managerloginout")
    public String  loginout(HttpServletRequest request){
        request.getSession().removeAttribute("manager");
        return "admin/login";
    }


}
