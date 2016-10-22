package cn.qd.mybatis.frist;

import cn.qd.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * @author July
 * @version 1.0
 * @date 2016年10月22日下午3:40:30
 * @Description 测试类
 */
public class MybatisTest {

    // 会话工厂
    private SqlSessionFactory SqlSessionFactory;

    // 创建工厂
    @Before
    public void init() throws IOException {

        // 配置文件（SqlMapConfig.xml）
        String resource = "SqlMapConfig.xml";

        // 加载配置文件到输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂
        SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    // 测试根据id查询用户（得到单条记录）
    @Test
    public void testFindUserById() {

        // 通过sqlSessionFactory创建sqlSession
        // 通过sqlsesion操作数据库
        // 参数一：namespace+statement的id
        // 参数二：传入参数
        User user = null;
        try (SqlSession sqlSession = SqlSessionFactory.openSession()) {
            user = sqlSession.selectOne("test.findUserById", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(user);
    }
}
