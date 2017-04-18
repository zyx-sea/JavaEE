package java;

/**
 * 抽象装饰类<br>
 * create:2017-04-18 11:28
 *
 * @author zhou
 */
public abstract class Attachment extends Phone {

    Phone x;

    public Attachment(Phone x) {
        this.x = x;
    }

    @Override
    public double cost() {
        return x.cost();
    }

    public String getDescription() {
        return x.getDescription();
    }
}
