package cn.zh.shop.action;

import cn.zh.shop.model.Content;
import cn.zh.shop.service.impl.ContentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

/**
 * 首页Action<br>
 * create:2016-11-22 9:28
 *
 * @author zhou
 * @version 1.0
 */
public class IndexAction extends ActionSupport implements ModelDriven<List<Content>> {

    private ContentServiceImpl contentServiceImpl;
    private List<Content> contentList;

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    //调用contentserviceImpl的findall方法
    @Override
    public String execute() throws Exception {
        contentServiceImpl = new ContentServiceImpl();
        contentList = contentServiceImpl.findall();
        return "index_success";
    }

    @Override
    public List<Content> getModel() {
        return contentList;
    }

}
