package cn.taotao.july.service.impl;

import cn.taotao.july.mapper.UsersMapper;
import cn.taotao.july.pojo.Users;
import cn.taotao.july.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类<br>
 * create:2017-04-27 15:10
 *
 * @author zhou
 */
@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper,Users> implements UserService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users findUserByName(String username) {
        Users users=new Users();
        users.setUsersName(username);
        return  usersMapper.selectOne(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersMapper.selectList(new EntityWrapper<Users>());
    }

    @Override
    public Integer insertUser(Users users) {
        return usersMapper.insert(users);
    }

    @Override
    public int update(Users users) {
        return usersMapper.updateById(users);
    }

    @Override
    public int delete(int id) {
        return usersMapper.deleteById(id);
    }
    public Page selectUser(Integer pageNumber,Integer pageSize){
        return selectPage(new Page<>(pageNumber,pageSize),null);
    }
}
