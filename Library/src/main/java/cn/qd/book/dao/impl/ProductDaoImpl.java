package cn.qd.book.dao.impl;

import cn.qd.book.dao.ProductDao;
import cn.qd.book.model.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 商品信息实现类<br>
 * create:2016-10-23 22:18
 *
 * @author zhou
 * @version 1.0
 */
public class ProductDaoImpl implements ProductDao {

    private SqlSessionFactory sqlSessionFactory=null;
    private SqlSession sqlSession=null;

    public ProductDaoImpl() throws Exception {
        // 配置文件（SqlMapConfig.xml）
        String resource = "SqlMapConfig.xml";

        // 加载配置文件到输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public List<Product> findProductAll( ) throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Product> products = sqlSession.selectList("product.findProductAll");
        sqlSession.close();
        return products;
    }

    public String findProductPic(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String pic = sqlSession.selectOne("product.findProductPic",id);
        sqlSession.close();
        return pic;
    }
}
