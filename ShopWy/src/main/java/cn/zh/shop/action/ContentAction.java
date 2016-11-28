package cn.zh.shop.action;

import cn.zh.shop.model.Content;
import cn.zh.shop.service.impl.ContentServiceImpl;
import com.opensymphony.xwork2.ActionContext;

import java.io.IOException;
import java.util.Map;

/**
 * 商品内容action类<br>
 * create:2016-11-18 9:35
 *
 * @author zhou
 * @version 1.0
 */
public class ContentAction {

    private Content content;
    private ContentServiceImpl contentServiceImpl;
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    //调用contentserviceImpl的findshow方法
    public String findshow() {
        try {
            contentServiceImpl = new ContentServiceImpl();
        } catch (IOException e) {
            e.printStackTrace();
        }
        content = contentServiceImpl.findshow(id);
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> session = ac.getSession();
        session.put("title", content.getTitle());
        session.put("icon", content.getIcon());
        session.put("price", content.getPrice());
        session.put("text",content.getText());
        return "findshow";
    }

}
