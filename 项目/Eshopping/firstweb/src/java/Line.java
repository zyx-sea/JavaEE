package java;

/**
 * 具体装饰类<br>
 * create:2017-04-18 11:42
 *
 * @author zhou
 */
public class Line extends Attachment {
    double lineprice;

    public Line(Phone x, double lineprice) {
        super(x);
        this.lineprice = lineprice;
    }

    public String getDescription() {
        return  super.getDescription()+"+手机数据线";
    }

    public double cost(){
        return super.cost()+this.getLineprice();
    }

    public double getLineprice() {
        return lineprice;
    }

}
