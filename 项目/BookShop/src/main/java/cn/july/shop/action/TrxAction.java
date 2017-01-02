package cn.july.shop.action;

import cn.july.shop.model.Trx;
import cn.july.shop.service.TrxService;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单Action类<br>
 * create:2016-12-28 21:58
 *
 * @author zhou
 * @version 0.0.1
 */
@Controller
@Scope("prototype")
public class TrxAction implements ModelDriven<List<Trx>> {
    @Resource
    private TrxService trxService;
    private String str = null;
    private List<Trx> trxList;  //用户所有订单
    private Integer id;
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
