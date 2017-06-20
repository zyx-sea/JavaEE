package cn.taotao.july.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页<br>
 * create:2017-05-04 14:32
 *
 * @author zhou
 */
@Controller
public class HomeController {
    @RequestMapping("/{path}")
    public String login(@PathVariable String path){
        return path;
    }

}
