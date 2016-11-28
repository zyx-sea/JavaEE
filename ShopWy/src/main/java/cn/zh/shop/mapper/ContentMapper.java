package cn.zh.shop.mapper;

import cn.zh.shop.model.Content;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <br>
 * create:2016-11-22 10:07
 *
 * @author zhou
 */
public interface ContentMapper {

    @Select("select * from content")
    public List<Content> findall();//查询出商品所有信息

    @Select("select * from content where id=#{id};")
    public Content findshow(Integer id);  //根据商品编号查出商品所有信息

}
