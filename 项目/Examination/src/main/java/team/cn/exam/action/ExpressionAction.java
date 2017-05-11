package team.cn.exam.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import team.cn.exam.model.Expression;
import team.cn.exam.service.ExpressionService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 运算式<br>
 * create:2017-04-13 17:03
 *
 * @author zhou
 */
@Controller
@Scope("prototype")
public class ExpressionAction extends ActionSupport implements ModelDriven<List<Expression>>{
    //extends ActionSupport

    @Resource
    private ExpressionService expressionService;
    private String str;
    private List<Expression> expressions;
    private int fws1;   //范围数1
    private int fws2;   //范围数2
    private String[] algorithm=new String[4];  //运算法则
    private int amount; //题数
    private String answer;  //答案

    //出题
    public String  generate() {
        try{
            expressions=expressionService.generate(fws1,fws2,algorithm,amount,answer);
           if(expressions!=null){
                str="success";
            }else
                str="error";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return str;
    }

    @Override
    public List<Expression> getModel() {
        if(expressions==null){
            expressions=new ArrayList<Expression>();
        }
        return expressions;
    }

    public int getFws1() {
        return fws1;
    }

    public void setFws1(int fws1) {
        this.fws1 = fws1;
    }

    public int getFws2() {
        return fws2;
    }

    public void setFws2(int fws2) {
        this.fws2 = fws2;
    }

    public String[] getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String[] algorithm) {
        this.algorithm = algorithm;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }


}

