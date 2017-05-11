package cn.taotao.july.service.impl;

import cn.taotao.july.mapper.PersonMapper;
import cn.taotao.july.pojo.Person;
import cn.taotao.july.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户实现类<br>
 * create:2017-04-27 15:10
 *
 * @author zhou
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PersonMapper personMapper;
    @Override
    public Person findUserByName(String username) {
        Person person = new Person();
        person.setUsername(username);
        return  personMapper.selectOne(person);
    }
}
