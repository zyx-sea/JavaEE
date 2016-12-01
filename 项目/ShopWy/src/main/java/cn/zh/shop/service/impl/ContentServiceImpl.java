package cn.zh.shop.service.impl;

import cn.zh.shop.mapper.ContentMapper;
import cn.zh.shop.model.Content;
import cn.zh.shop.service.inter.ContentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 商品内容impl<br>
 * create:2016-11-18 9:52
 *
 * @author zhou
 * @version 1.0
 */
public class ContentServiceImpl implements ContentService {

    private List<Content> contents;
    private Content content;
    private SqlSessionFactory sessionFactory;
    private SqlSession session;
    private ContentMapper contentMapper;

    public ContentServiceImpl() throws IOException {
        //声明配置文件的读值
        String resource = "Configure.xml";
        //加载应用配置文件
        InputStream reader = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        Configuration configuration = sessionFactory.getConfiguration();
        configuration.addMapper(ContentMapper.class);
        //获取session类
        session = sessionFactory.openSession();
        //获取操作类
        contentMapper = session.getMapper(ContentMapper.class);
    }

    public List<Content> findall() {
        try {
            //完成查询操作,查询出所有的商品信息
            contents = contentMapper.findall();
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            session.close();
            return contents;
        }

    }

    @Override
    public Content findshow(Integer id) {
        try {
            //完成查询操作,,根据商品id查询出商品信息
            content = contentMapper.findshow(id);
        } finally {
            session.close();
            return content;
        }
    }
/*    @Test
    public void findsho() {
        try {
            //完成查询操作,,根据商品id查询出商品信息
            content = contentMapper.findshow(1);
        } finally {
            System.out.println(content.getId()+"\n"+content.getTitle()+"\n");
        }

    }*/
}
