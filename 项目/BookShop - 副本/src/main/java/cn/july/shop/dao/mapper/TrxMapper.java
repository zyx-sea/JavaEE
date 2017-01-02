package cn.july.shop.dao.mapper;


import cn.july.shop.model.Content;
import cn.july.shop.model.Trx;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 訂單<br>
 * create:2016-11-27 12:16
 *
 * @author zhou
 * @version 1.0
 */
public interface TrxMapper {

    //根据用户id显示订单信息
    @Select("select trx.id,trx.price,time,title,icon,contentId,personId from trx,content where personId=#{personId} and trx.contentId=content.id;")
    public List<Trx> showTrx(Integer personId);//查询出订单所有信息

    //根据id加入购物车
    @Insert("insert into trx(contentId,personId,price,time)values (#{content.contentId},#{personId},#{content.price},#{time});")
    public void buy(Content content,String time,int personId);

}
