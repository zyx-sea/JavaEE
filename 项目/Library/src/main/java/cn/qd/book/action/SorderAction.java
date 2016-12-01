package cn.qd.book.action;

import cn.qd.book.dao.impl.SorderDaoImpl;
import cn.qd.book.model.Sorder;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 购物车action类<br>
 * create:2016-10-26 20:36
 *
 * @author zhou
 * @version 1.0
 */
public class SorderAction extends ActionSupport  implements ModelDriven<Sorder>{

    private Sorder sorder=null;
    List<Sorder> sorders =new ArrayList<Sorder>();
    public List<Sorder> getSorders() {
        return sorders;
    }

    public void setSorders(List<Sorder> sorders) {
        this.sorders = sorders;
    }

    public Sorder getSorder() {
        return sorder;
    }

    public void setSorder(Sorder sorder) {
        this.sorder = sorder;
    }
    /*插入一条商品信息*/
    public String addsorder(){
        try {
            SorderDaoImpl sorderimpl=new SorderDaoImpl();
            sorderimpl.addSorder(sorder);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "addsorder";
    }

    /*根据id删除商品进程*/
    public String delsorder(){

        try {
            SorderDaoImpl  sorderimpl = new SorderDaoImpl();
            sorderimpl.delSorder(sorder.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "delsorder";
    }

    /*查询出购物车信息*/

    public String findsorder(){

        try {
            SorderDaoImpl   sorderimpl = new SorderDaoImpl();
            sorders=sorderimpl.findSorderAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "findsorder";
    }

    public Sorder getModel() {
        return sorder;
    }
}
