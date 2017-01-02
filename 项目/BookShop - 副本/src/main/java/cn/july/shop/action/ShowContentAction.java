package cn.july.shop.action;

import cn.july.shop.model.Content;
import cn.july.shop.service.ContentService;
import cn.july.shop.service.impl.ContentServiceImpl;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

/**
 * 商品显示<br>
 * create:2016-12-30 14:02
 *
 * @author zhou
 */
public class ShowContentAction {
    private String str = null;
    private Integer id;
    private ContentService contentService = new ContentServiceImpl();

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

}
