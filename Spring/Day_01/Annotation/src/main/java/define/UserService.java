package define;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * bean注解方式<br>
 * create:2016-12-23 16:32
 * 用户业务层
 *
 * @author zhou
 */
@Service("UserService")
public class UserService {

    //注入name属性/*简单属性的注入*/
    @Value("小明")
    private String name;
    /*复杂属性的注入*/
/*    @Autowired(required = false)  *//*按照类型注入*//*  *//*required = false注入不成功显示null*//*
    @Qualifier("user")      *//*按名字注入*/
    @Resource(name = "user") /*等同于按名字注入*/
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", userDao=" + userDao +
                '}';
    }
}
