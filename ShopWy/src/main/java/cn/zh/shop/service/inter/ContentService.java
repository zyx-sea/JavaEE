package cn.zh.shop.service.inter;

import cn.zh.shop.model.Content;

import java.util.List;

/**
 * 商品内容接口类<br>
 * create:2016-11-22 10:50
 *
 * @author zhou
 * @version 1.0
 */
public interface ContentService {

    public List<Content> findall();//查询出商品所有信息

    public Content findshow(Integer id);  //根据商品编号查出商品所有信息
}
