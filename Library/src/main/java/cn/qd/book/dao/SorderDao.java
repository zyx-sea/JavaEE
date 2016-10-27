package cn.qd.book.dao;

import cn.qd.book.model.Sorder;

import java.util.List;

/**
 * 购物车dao接口<br>
 * create:2016-10-25 19:54
 *
 * @author zhou
 * @version 1.0
 */
public interface SorderDao {

    /*加入购物车*/
    public int  addSorder(Sorder sorder) throws Exception;

    /*根据编号移出购物车*/

    public int  delSorder(int id) throws Exception;

    /*查询购物车全部信息*/
    public List<Sorder> findSorderAll( ) throws Exception;

}
