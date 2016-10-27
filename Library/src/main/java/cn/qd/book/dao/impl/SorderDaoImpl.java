package cn.qd.book.dao.impl;

import cn.qd.book.dao.SorderDao;
import cn.qd.book.model.Sorder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * 购物车实现类<br>
 * create:2016-10-25 20:07
 *
 * @author zhou
 * @version 1.0
 */
public class SorderDaoImpl implements SorderDao {

    private SqlSessionFactory sqlSessionFactory = null;
    private SqlSession sqlSession = null;

    public SorderDaoImpl() throws IOException {
        // 配置文件（SqlMapConfig.xml）
        String resource = "SqlMapConfig.xml";

        // 加载配置文件到输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public int addSorder(Sorder sorder) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int tag = sqlSession.insert("sorder.addSorder", sorder);
        sqlSession.commit();
        sqlSession.close();
        return tag;
    }

    public int delSorder(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int num = sqlSession.delete("sorder.delSorder",id );
        sqlSession.commit();
        sqlSession.close();
        return num;
    }

    public List<Sorder> findSorderAll() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Sorder> sorders = sqlSession.selectList("sorder.findSorder");
        sqlSession.close();
        return sorders;
    }
}
