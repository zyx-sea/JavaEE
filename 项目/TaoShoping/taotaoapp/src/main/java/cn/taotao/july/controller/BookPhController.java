package cn.taotao.july.controller;

import cn.taotao.july.pojo.Book;
import cn.taotao.july.service.BookPhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 哲学类书籍的Controller类<br>
 * create:2017-05-09 15:00
 *
 * @author zhou
 */
@Controller
public class BookPhController {
    @Autowired
    private BookPhService bookPhService;
    @RequestMapping("/findBookPh")
    @ResponseBody
    public List<Book> findBookPh(){
        return  bookPhService.findBookPh();
    }

}
