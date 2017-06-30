package cn.taotao.july.service;

import cn.taotao.july.pojo.OrdersItem;

/**
 * 订单<br>
 * create:2017-06-29 16:03
 *
 * @author zhou
 */
public interface OrdersItemService {
    /*插入订单*/
    public Integer insertOrder(OrdersItem ordersItem);
    /*更新用户信息*/
    public Integer updateOrder(OrdersItem ordersItem);

}
