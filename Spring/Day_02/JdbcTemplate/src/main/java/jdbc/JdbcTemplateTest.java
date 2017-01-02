package jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * jdbctemplate测试<br>
 * create:2016-12-25 23:30
 *
 * @author zhou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JdbcTemplateTest {
    @Autowired
    @Qualifier("jdbctemplate")
    private JdbcTemplate jdbcTemplate;
    @Test
/*使用配置文件*/

    public void dem(){
        jdbcTemplate.execute("create table user(id int, name varchar(20))");
    }


    @Test
    /*不使用配置文件，进行jdbctemplate入门测试*/
    public void demo(){
        /*构造jdbctemplate，必须数据库连接池*/
        /*内置连接池*/
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring3conn");
        dataSource.setUsername("root");
        dataSource.setPassword("4321");


        // 2、使用连接池构造 jdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // 3、操作数据库
        jdbcTemplate.execute("create table user(id int, name varchar(20))");
    }

}
