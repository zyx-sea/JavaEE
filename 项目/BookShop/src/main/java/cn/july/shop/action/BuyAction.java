package cn.july.shop.action;

import cn.july.shop.service.TrxService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * BUY<br>
 * create:2016-12-30 15:57
 *
 * @author zhou
 * @version 0.0.1
 */
@Controller
@Scope("prototype")
public class BuyAction {
    @Resource
    private TrxService trxService;
    private int code;

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    private Map<String, Object> result = new HashMap<>();



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String buy(){
        try {
            trxService.buy();
           code = 200;
           result.put("message","购买成功！");
        }catch (Exception e){
            result.put("message","购买失敗!");
            System.out.println(e.getMessage());
        }

        return "message";
    }

}
