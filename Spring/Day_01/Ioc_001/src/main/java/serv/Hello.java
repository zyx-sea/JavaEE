package serv;

/**
 * <br>
 * create:2016-12-18 16:45
 * 实验类
 *
 * @author zhou
 */
public class Hello implements HelloDao {

    private String str;
    public void say() {
        System.out.println("你好！！"+str);
    }
    public void setStr(String str){
        this.str=str;
    }
}
