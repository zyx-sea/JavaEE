package cn.taotao.july.service.impl;

import cn.taotao.july.mapper.OrdersItemMapper;
import cn.taotao.july.pojo.OrdersItem;
import cn.taotao.july.service.OrdersItemService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 订单<br>
 * create:2017-06-29 16:03
 *
 * @author zhou
 */
public class OrdersServiceImpl implements OrdersItemService {

    @Autowired
    private OrdersItemMapper ordersItemMapper;
    /*插入订单*/
    @Override
    public Integer insertOrder(OrdersItem ordersItem) {
        return ordersItemMapper.insert(ordersItem);
    }

    /*更新订单*/
    @Override
    public Integer updateOrder(OrdersItem ordersItem) {
        return ordersItemMapper.updateById(ordersItem);
    }
}
