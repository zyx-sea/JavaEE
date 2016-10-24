package cn.qd.mybatis.dao.impl;

import cn.qd.mybatis.dao.UserDao;
import cn.qd.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * 用户实现类<br>
 * create:2016-10-23 11:17
 *
 * @author zhou
 * @version 1.0
 */
public class UserDaoImpl implements UserDao{
    private SqlSessionFactory sqlSessionFactory;

    //将sqlsessionfactory注入

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User findUserById(int id) throws Exception {
        //创建sqlsession
        SqlSession sqlSession=sqlSessionFactory.openSession();

        //根据id查询用户信息
        User user=sqlSession.selectOne("test.findUserById",id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findUserByUsername(String username) throws Exception {
        //创建sqlsession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> list=sqlSession.selectList("test.findUserByName",username);
        sqlSession.close();
        return list;
    }

    @Override
    public void insertUser(User user) throws Exception {
        //创建sqlsession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.insert("test.insertUser",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
