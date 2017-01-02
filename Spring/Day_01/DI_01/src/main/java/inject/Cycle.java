package inject;

/**
 * set方法注入属性依赖<br>
 * create:2016-12-22 23:59
 *
 * @author zhou
 */
public class Cycle {
    private String name;
    private int count;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
