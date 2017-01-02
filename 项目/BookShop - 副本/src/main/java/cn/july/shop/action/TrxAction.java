package cn.july.shop.action;

import cn.july.shop.model.Content;
import cn.july.shop.model.Trx;
import cn.july.shop.service.TrxService;
import cn.july.shop.service.impl.TrxServiceImpl;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

/**
 * 订单Action类<br>
 * create:2016-12-28 21:58
 *
 * @author zhou
 * @version 0.0.1
 */
public class TrxAction implements ModelDriven<List<Trx>> {


    private String str = null;
    private List<Trx> trxList;  //用户所有订单
    private Integer id;
    private TrxService trxService = new TrxServiceImpl();

    public List<Trx> getTrxList() {
        return trxList;
    }

    public void setTrxList(List<Trx> trxList) {
        this.trxList = trxList;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //根据用户id显示订单信息
    public String showTrx() {

        trxList = trxService.showTrx(id);
        if (trxList != null) {
            str = "show_success";
        } else {
            str = "show_error";
        }
        return str;
    }



    @Override
    public List<Trx> getModel() {
        return trxList;
    }
}
