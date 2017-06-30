package cn.taotao.july.controller;

import cn.taotao.july.pojo.Book;
import cn.taotao.july.service.BookPhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    /*根据类型查找书*/
    @RequestMapping("/findBookPh")
    @ResponseBody
    public Map<String, Object> findBookPh(@ModelAttribute("book") Book book, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        List<Book> booklist=bookPhService.findBookPh(book.getBtId());
        if (booklist!=null){
            session.setAttribute("productlist",booklist);
            map.put("msg",true);
        }else {
            map.put("msg",false);
        }
        return map;
    }
    /*判断是否有此类书籍*/
    @RequestMapping("/adjustpro")
    @ResponseBody
    public Map<String,Object>  adjustpro(HttpSession session){
        Map<String,Object> booklist=new HashMap<>();
        booklist.put("booklist",session.getAttribute("productlist"));
        return booklist;
    }
    /*根据书号查看书籍详情*/
    @RequestMapping("/findBookByno")
    @ResponseBody
    public  Map<String,Object> findBookByno(@ModelAttribute("book") Book book, HttpSession session){
        Book book1=bookPhService.findBookByno(book.getBookNo());
        Map<String,Object> map = new HashMap<>();
        if(book1!=null){
           /* System.out.println(book1.getBookAuthor());*/
            session.setAttribute("book",book1);
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }
        return  map;
    }
    /*判断是否有此书*/
    @RequestMapping("/adjustbook")
    @ResponseBody
    public Map<String,Object>  adjustbook(HttpSession session){
        Map<String,Object> book=new HashMap<>();
        book.put("book",session.getAttribute("book"));
        return book;
    }
    /*查找所有书籍*/
    @RequestMapping("/findallbook")
    @ResponseBody
    public  List<Book> findAllbook(){
        return bookPhService.findAllBook();
    }
}
