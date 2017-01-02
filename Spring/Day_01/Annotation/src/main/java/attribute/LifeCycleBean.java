package attribute;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <br>
 * create:2016-12-23 18:39
 *
 * @author zhou
 */
@Component("lifebean")
public class LifeCycleBean {

    @PostConstruct
    public void setup() {
        System.out.println("初始化。。。。");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("销毁。。。");

    }

}
