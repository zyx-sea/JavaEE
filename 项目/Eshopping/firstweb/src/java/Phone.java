package java;

/**
 * 抽象组件<br>
 * create:2017-04-18 11:23
 *
 * @author zhou
 */
public abstract class Phone {

    public String description="未知";
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
