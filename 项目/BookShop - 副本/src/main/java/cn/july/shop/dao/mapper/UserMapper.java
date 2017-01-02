package cn.july.shop.dao.mapper;

import cn.july.shop.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * zhouyaxin<br>
 * create:2016-12-27 19:20
 *
 * @author zhou
 */
public interface UserMapper {

    @Select("select * from person where id = #{id}")
    User getUserById(int id);

    @Select("select * from person where username = #{username} and password = #{password} ")
    User checkUser(@Param("username") String username, @Param("password") String password);

}
