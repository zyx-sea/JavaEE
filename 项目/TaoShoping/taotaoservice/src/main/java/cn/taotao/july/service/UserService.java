package cn.taotao.july.service;

import cn.taotao.july.pojo.Users;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

/**
 * 用户类<br>
 * create:2017-04-27 15:09
 *
 * @author zhou
 */
public interface UserService {
    /*按名字查询*/
    public Users findUserByName(Users users);
    /*得到所有用户信息*/
    public List<Users> getAllUsers();
    /*插入新用户*/
    public Integer insertUser(Users users);
    /*更新用户信息*/
    public int update(Users users);
    /*删除用户信息*/
    public int delete(Users users);

    public Page selectUser(Integer pageNumber, Integer pageSize);

}
