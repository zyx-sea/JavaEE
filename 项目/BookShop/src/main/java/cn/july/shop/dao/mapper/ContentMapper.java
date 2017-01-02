package cn.july.shop.dao.mapper;

import cn.july.shop.model.Content;
import org.apache.ibatis.annotations.*;

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

    @Insert("insert into content (id,price,title,icon,abstracts,text)values (#{id},#{price},#{title},#{icon},#{abstracts},#{text})")
    public void insertContent(Content content);//插入一条商品信息

    @Update("UPDATE content set id=#{id},price=#{content.price},title=#{content.title},icon=#{content.icon},abstracts=#{content.abstracts},text=#{content.text} where id=#{id};")
    public void updateContent(@Param("content") Content content, @Param("id") int id);  //更新一条商品信息

    @Delete("delete from content where id=#{id};")
    public void deletecontent(Integer id);//根据id删除商品信息



}
