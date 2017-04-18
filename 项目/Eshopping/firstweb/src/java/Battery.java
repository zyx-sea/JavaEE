package java;

/**
 * 具体装饰类<br>
 * create:2017-04-18 11:31
 *
 * @author zhou
 */
public class Battery extends Attachment {

    double batteryprice;

    public Battery(Phone x, double batteryprice) {
        super(x);
        this.batteryprice = batteryprice;
    }

    public String getDescription() {
        return  super.getDescription()+"+移动充电器";
    }

    public double cost(){
        return super.cost()+this.getBatteryprice();
    }

    public double getBatteryprice() {
        return batteryprice;
    }
}
