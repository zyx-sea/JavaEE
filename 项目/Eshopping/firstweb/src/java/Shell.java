package java;

/**
 * 具体装饰类<br>
 * create:2017-04-18 11:37
 *
 * @author zhou
 */
public class Shell extends Attachment{
    double shellprice;

    public Shell(Phone x, double shellprice) {
        super(x);
        this.shellprice = shellprice;
    }

    public String getDescription() {
        return  super.getDescription()+"+手机壳";
    }

    public double cost(){
        return super.cost()+this.getShellprice();
    }

    public double getShellprice() {
        return shellprice;
    }
}
