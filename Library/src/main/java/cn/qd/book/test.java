package cn.qd.book;

import cn.qd.book.dao.impl.SorderDaoImpl;
import cn.qd.book.model.Sorder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Test<br>
 * create:2016-10-26 23:44
 *
 * @author zhou
 * @version 1.0
 */
public class test {

    List<Sorder> sorders =new ArrayList<Sorder>();
    @Test
    public void test() {
        try {
            SorderDaoImpl sorderimpl = new SorderDaoImpl();
            sorders = sorderimpl.findSorderAll();
     } catch (Exception e) {
            e.printStackTrace();
        }
       System.out.print(sorders.get(1).getName());
    }


}
