package inject;

/**
 * 轿车<br>
 * create:2016-12-22 23:43
 *用构造函数注入属性依赖
 * @author zhou
 */
public class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
