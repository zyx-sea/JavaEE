package beantest;

/**
 * bean3的工厂类<br>
 * create:2016-12-21 15:16
 *
 * @author zhou
 */
public class Bean3Factory {

    /*实例工厂方法，方法不再是静态的，而是先创建bean3factory实例，再调用getbean */
    public Bean3 getbean3(){
        return new Bean3();
    }

}
