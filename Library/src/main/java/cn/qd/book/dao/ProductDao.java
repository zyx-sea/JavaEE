package cn.qd.book.dao;

import cn.qd.book.model.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 商品信息dao类<br>
 * create:2016-10-23 22:15
 *
 * @author zhou
 * @version 1.0
 */
public interface ProductDao {
    /*查询商品全部信息*/
    @Select("select * from product")
    public List<Product> findProductAll();

    /*查询出商品图片信息，根据商品id*/
    public  String findProductPic(int id);

}
