package cn.july.shop.action;

import cn.july.shop.model.Content;
import cn.july.shop.service.ContentService;
import cn.july.shop.service.TrxService;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 商品action类<br>
 * create:2016-12-28 17:02
 *
 * @author zhou
 * @version 0.0.1
 */
@Controller
@Scope("prototype")
public class ContentAction implements ModelDriven<Content> {
    @Resource
    private ContentService contentService;
    private TrxService trxService;
    private String str = null;

    private Content c;

    public Content getC() {
        return c;
    }

    public void setC(Content c) {
        this.c = c;
    }

    //发布商品
    public String insertContent() {
        try {
            contentService.insertContent(c);
            str = "public_success";
            System.out.println("插入成功");
        } catch (Exception e) {
            System.out.println("插入失败了");
            str = "public_error";
        }
        return str;
    }

    //更新商品信息
    public String updateContent() {

        try {
            contentService.updateContent(c);
            str = "update_success";
            System.out.println("更新商品信息成功");
        } catch (Exception e) {
            System.out.println("更新失败了");
            System.out.println(e.getMessage());
            str = "update_error";
        }

        return str;
    }
    //加入购物车
    public String  buy() {
        try {
            trxService.buy();
            System.out.println("购买成功！");
            str="buy_success";
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("购买失败！");
        }
        return str;
    }

    @Override
    public Content getModel() {
        if(c==null){
            c=new Content();
        }
        return c;
    }
}
