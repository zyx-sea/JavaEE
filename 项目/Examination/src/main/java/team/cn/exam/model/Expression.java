package team.cn.exam.model;

/**
 * 运算式类<br>
 * create:2017-04-13 16:06
 *
 * @author zhou
 * @version 1.0
 */
public class Expression {
    private Integer  operand1;  //运算元1
    private Integer  operand2;  //运算元2
    private String operator; //运算子
    private Integer result; //结果

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
