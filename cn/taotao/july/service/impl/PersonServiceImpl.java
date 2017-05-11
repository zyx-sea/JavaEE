package cn.taotao.july.service.impl;

import cn.taotao.july.pojo.Person;
import cn.taotao.july.mapper.PersonMapper;
import cn.taotao.july.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhou
 * @since 2017-05-07
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {
	
}
