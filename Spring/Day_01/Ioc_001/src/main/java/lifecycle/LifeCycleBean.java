package lifecycle;

/**
 * 测试bean生命周期<br>
 * create:2016-12-22 16:48
 *
 * @author zhou
 */
public class LifeCycleBean {

    public LifeCycleBean() {
        System.out.println("bean被构造");
    }

    public void setup(){
        System.out.println("初始化");
    }
    public void shutdown(){
        System.out.println("销毁");
    }

}
