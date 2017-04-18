package team.cn.exam.dao.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import team.cn.exam.model.User;

/**
 * <br>
 * create:2017-04-09 20:54
 *
 * @author zhou
 */
public interface UserMapper {

    /*登录验证*/
    @Select("select * from user where username=#{username}and password=#{password}")
    public User checkUser(@Param("username")String username,@Param("password")String password);

    /*管理员登录*/
    @Select("select * from user where username=#{username}and password=#{password}and usertype=0")
    public User checkAdmin(@Param("username")String username,@Param("password")String password);

    /*注册用户*/
    @Insert("insert into user (username,password,usertype) values (#{user.username},#{user.password},#{user.usertype});")
    public void add(@Param("user")User user);

    /*按姓名查询用户信息*/
    @Select("select * from user where username=#{username}")
    public User query(@Param("username")String username);

    /*根据id注销用户*/
    @Delete("delete from user where id=#{id}")
    public void delete(@Param("id")int id);

}
