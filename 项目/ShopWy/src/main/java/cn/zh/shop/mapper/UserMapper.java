package cn.zh.shop.mapper;

import cn.zh.shop.model.Person;
import org.apache.ibatis.annotations.Select;

/**
 * 用户mapper类<br>
 * create:2016-11-22 21:14
 *
 * @author zhou
 * @version 1.0
 */
public interface UserMapper {

    //根据姓名查询
    @Select("select * from person where username=#{username}")
    public Person check(String username);

}
