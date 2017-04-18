package java;

/**
 * 具体组件<br>
 * create:2017-04-18 11:26
 *
 * @author zhou
 */
public class Huaweipad extends Phone {

    double orginalprice;

    public Huaweipad(double orginalprice) {
        this.orginalprice = orginalprice;
        description="荣耀8 4GB+64GB 全网通4G手机 珠光白";
    }

    @Override
    public double cost() {
        return orginalprice;
    }
}
