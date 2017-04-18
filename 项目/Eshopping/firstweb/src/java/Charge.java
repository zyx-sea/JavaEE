package java;

/**
 * 具体装饰类<br>
 * create:2017-04-18 11:40
 *
 * @author zhou
 */
public class Charge extends Attachment {

    double chargeprice;

    public Charge(Phone x, double chargeprice) {
        super(x);
        this.chargeprice = chargeprice;
    }

    public String getDescription() {
        return  super.getDescription()+"+手机充电插头";
    }

    public double cost(){
        return super.cost()+this.getChargeprice();
    }

    public double getChargeprice() {
        return chargeprice;
    }
}
