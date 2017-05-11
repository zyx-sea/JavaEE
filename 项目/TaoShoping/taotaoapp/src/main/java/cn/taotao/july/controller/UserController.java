package cn.taotao.july.controller;

import cn.taotao.july.pojo.Person;
import cn.taotao.july.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <br>
 * create:2017-04-27 16:49
 *
 * @author zhou
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/user/{username}")
    @ResponseBody
    public Person findUserByUsername(@PathVariable  String username){
        return userService.findUserByName(username);
    }

}
