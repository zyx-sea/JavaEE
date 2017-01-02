package cn.july.shop.service;

import cn.july.shop.model.Content;

import java.util.List;

/**
 * <br>
 * create:2016-12-29 10:43
 *
 * @author zhou
 */
public interface ContentService {

    /*根据id 查询出商品信息*/
    public Content findshow(int id);

    //发布商品
    public void insertContent(Content content);

    //显示所有商品
    public List<Content> findall();

    //更新商品信息
    public void updateContent(Content content);

    //根据id删除商品
    public void deleteContent(int id);
}
