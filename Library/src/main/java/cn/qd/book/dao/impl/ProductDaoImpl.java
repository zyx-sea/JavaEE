package cn.qd.book.dao.impl;

import cn.qd.book.dao.ProductDao;
import cn.qd.book.model.Product;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * 商品信息实现类<br>
 * create:2016-10-23 22:18
 *
 * @author zhou
 * @version 1.0
 */
public class ProductDaoImpl implements ProductDao{

private SqlSessionFactory sqlSessionFactory;

    public ProductDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<Product> findProductAll(int open) throws Exception {

        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<Product> list=sqlSession.selectList("product.findProductAll",open);
        sqlSession.close();
        return list;
    }
}
