package cn.july.shop.action;


import cn.july.shop.model.Content;
import cn.july.shop.service.ContentService;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * 首页Action<br>
 * create:2016-11-22 9:28
 *
 * @author zhou
 * @version 1.0
 */
@Controller
@Scope("prototype")
public class IndexAction implements ModelDriven<List<Content>> {

    @Resource
    ContentService contentService;
    private String str=null;
    private List<Content> contentList;

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    //显示所有商品
    public String findall(){
        contentList=contentService.findall();
        if (contentList!=null){
            str="show_success";
        }else {
            str="show_error";
        }
        return str;
    }

    @Override
    public List<Content> getModel() {
        return contentList;
    }

}
