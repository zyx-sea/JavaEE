package cn.july.shop.service;

import cn.july.shop.model.Trx;

import java.util.List;

/**
 * 订单<br>
 * create:2016-12-29 11:03
 *
 * @author zhou
 * @version 0.0.1
 */
public interface TrxService {

    //根据用户id显示订单信息
    public List<Trx> showTrx(Integer personid);

    //根据id加入购物车
    public void buy();
}
