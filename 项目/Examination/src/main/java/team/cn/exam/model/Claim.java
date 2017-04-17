package team.cn.exam.model;

/**
 * 试题要求<br>
 * create:2017-04-13 15:43
 *
 * @author zhou
 * @version 1.0
 */
public class Claim {

    private Integer fws1;   //范围数1
    private Integer fws2;   //范围数2
    private String[] algorithm=new String[4];  //运算法则
    private Integer amount; //题数
    private String answer;  //答案

    public Integer getFws1() {
        return fws1;
    }

    public void setFws1(Integer fws1) {
        this.fws1 = fws1;
    }

    public Integer getFws2() {
        return fws2;
    }

    public void setFws2(Integer fws2) {
        this.fws2 = fws2;
    }

    public String[] getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String[] algorithm) {
        this.algorithm = algorithm;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
