package cn.july.shop.service.impl;

import cn.july.shop.dao.mapper.TrxMapper;
import cn.july.shop.model.Content;
import cn.july.shop.model.Trx;
import cn.july.shop.model.User;
import cn.july.shop.service.TrxService;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 商品<br>
 * create:2016-12-29 11:05
 *
 * @author zhou
 */
@Service
public class TrxServiceImpl implements TrxService {

    @Resource
    private TrxMapper trxMapper ;

    //根据用户id显示订单信息
    @Override
    public List<Trx> showTrx(Integer personid) {
        List<Trx> trxList = trxMapper.showTrx(personid);
        return trxList;
    }

    //加入购物车
    @Override
    public void buy() {
        ActionContext ac = ActionContext.getContext();
        Map<String, Object> session = ac.getSession();
        User user = (User)session.get("user");
        Content content= (Content) session.get("content");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//系统当前日期
        String time= format.format(new Date());
        trxMapper.buy(content,time,user);
    }
}
