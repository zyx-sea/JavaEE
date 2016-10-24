package cn.qd.book.dao;

import cn.qd.book.model.Product;

import java.util.List;

/**
 * 商品信息dao类<br>
 * create:2016-10-23 22:15
 *
 * @author zhou
 * @version 1.0
 */
public interface ProductDao {

    public List<Product> findProductAll(int open) throws Exception;

}
