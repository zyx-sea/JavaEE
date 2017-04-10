package team.cn.exam.dao.mapper;

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

    @Select("select * from user where username=#{username}and password=#{password}")
    public User check(@Param("username")String username,@Param("password")String password);

    @Insert("insert into user (username,password,usertype) values (#{user.username},#{user.password},#{user.usertype});")
    public void add(@Param("user")User user);

}
