package jdbc;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 用户数据操作类<br>
 * create:2016-12-26 14:30
 * 实现user表的CURD
 *
 * @author zhou
 */
public class UserDao extends JdbcDaoSupport {

    /*添加*/
    public void save(User user) {
        String sql = "insert into user values(?,?)";
        this.getJdbcTemplate().update(sql, user.getId(), user.getName());
    }

    /*修改*/
    public void update(User user) {
        String sql = "update user set name=? where id=?";
        this.getJdbcTemplate().update(sql, user.getName(), user.getId());
    }

    /*简单查询*/
    /*查询记录总和*/
    public int count() {
        String sql = "select count(*) from user";
        return this.getJdbcTemplate().queryForObject(sql, Integer.class);
    }

    /*根据Id查询name*/
    public String findName(int id) {
        String sql = "select name from user where id=?";
        return this.getJdbcTemplate().queryForObject(sql, String.class, id);
    }

    /*复杂查询*/
    /*查询一个对象*/
    public User findUser(int id) {
        String sql = "select * from user where id=?";
        return this.getJdbcTemplate().queryForObject(sql,new UserRowMapper(),id);
    }

    /*查询所有的list(user)*/
    public List<User> findAll() {
        String sql = "select * from user";
        return this.getJdbcTemplate().query(sql,new UserRowMapper());
    }

    class UserRowMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            return user;
        }
    }
}
