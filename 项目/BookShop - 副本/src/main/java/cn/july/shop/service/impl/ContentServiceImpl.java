package cn.july.shop.service.impl;

import cn.july.shop.dao.mapper.ContentMapper;
import cn.july.shop.model.Content;
import cn.july.shop.service.ContentService;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * 商品<br>
 * create:2016-12-29 10:39
 *
 * @author zhou
 * @version 0.0.1
 */
public class ContentServiceImpl implements ContentService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context-dao.xml");
    ContentMapper contentMapper = applicationContext.getBean(ContentMapper.class);

    public Content findshow(int id) {
        Content content = contentMapper.findshow(id);
        return content;
    }

    @Override
    public void insertContent(Content content) {
        contentMapper.insertContent(content);
    }

    @Override
    public List<Content> findall() {
        List<Content> contentList = contentMapper.findall();
        return contentList;
    }

    @Override
    public void updateContent(Content content) {
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> session = ac.getSession();
        int id = ((Content) (session.get("content"))).getId();
        System.out.println(id);
        contentMapper.updateContent(content ,id);
    }


}
