package cn.july.shop.action;

import cn.july.shop.model.Content;
import cn.july.shop.service.ContentService;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 商品显示<br>
 * create:2016-12-30 14:02
 *
 * @author zhou
 */

@Controller
@Scope("prototype")
public class ShowContentAction {
    @Resource
    private ContentService contentService;
    private Integer id;
    public void setId(Integer id) {
        this.id = id;
    }

    //根据id显示商品信息
    public String findshow() {
        Content content = contentService.findshow(id);
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> session = ac.getSession();
        session.put("content", content);
        return "show_byid";
    }
    /*根據id刪除商品*/
    public String deleteContent(){
        try {
            contentService.deleteContent(id);
            System.out.println("刪除成功！");
        }catch (Exception e){
            System.out.println("刪除失敗！");
            System.out.println(e.getMessage());
        }
        return "delete_success";
    }

}
