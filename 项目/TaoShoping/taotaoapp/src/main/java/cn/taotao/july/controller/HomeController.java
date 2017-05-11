package cn.taotao.july.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页<br>
 * create:2017-05-04 14:32
 *
 * @author zhou
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String login(){
        return "index";
    }

}
