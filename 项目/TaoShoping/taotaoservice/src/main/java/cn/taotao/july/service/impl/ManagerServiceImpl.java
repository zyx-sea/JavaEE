package cn.taotao.july.service.impl;

import cn.taotao.july.mapper.ManagerMapper;
import cn.taotao.july.pojo.Manager;
import cn.taotao.july.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员<br>
 * create:2017-06-30 10:11
 *
 * @author zhou
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper managerMapper;
    @Override
    public Manager findManagerByname(String mngUsername) {
        return managerMapper.selectById(mngUsername);
    }
}
