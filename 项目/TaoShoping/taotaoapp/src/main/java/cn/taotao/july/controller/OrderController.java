package cn.taotao.july.controller;

import cn.taotao.july.pojo.OrdersItem;
import cn.taotao.july.service.OrdersItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单<br>
 * create:2017-06-29 16:19
 *
 * @author zhou
 */
public class OrderController {
    @Autowired
    OrdersItemService ordersItemService;
    /*插入用户*/
    @RequestMapping("/insertorder")
    @ResponseBody
    public Map<String,Boolean> insertorder(OrdersItem ordersItem){
        int userTotal=0;
        Map<String,Boolean> map=new HashMap<String, Boolean>() ;
        if (ordersItem.getOrdersNo()==null){
            userTotal=ordersItemService.insertOrder(ordersItem);
        }else{
            userTotal= ordersItemService.updateOrder(ordersItem);
        }
        if (userTotal>0){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;
    }

}
