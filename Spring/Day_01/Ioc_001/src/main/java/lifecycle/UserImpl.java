package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <br>
 * create:2016-12-22 17:13
 *
 * @author zhou
 */
public class UserImpl implements UserDao,BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean{

    private String company;


    public UserImpl() {
        System.out.println("第一步：bean的实例化.....");
    }

    public void setCompany(String company) {
        System.out.println("第二步：设置bean的属性：");
        this.company = company;
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("第三部：将xml配置Bean的name设置到程序中："+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四部：将整合工厂上下文对象设置到Bean中");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六部：属性设置完成后。。。");
    }
    public void setup(){
        System.out.println("第七部：配置的初始化方法");
    }
    @Override
    public void add() {
        System.out.println("第九部：业务操作。。添加");

    }

    @Override
    public void search() {
        System.out.println("第九部：业务操作。。搜");

    }
    @Override
    public void destroy() throws Exception {
        System.out.println("第十部：无需配置的销毁方法");
    }
    public void shutdown(){
        System.out.println("第十一步：手动配置的销毁方法");
    }
}
