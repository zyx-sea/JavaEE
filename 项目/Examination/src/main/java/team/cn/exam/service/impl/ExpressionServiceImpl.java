package team.cn.exam.service.impl;

import org.springframework.stereotype.Service;
import team.cn.exam.model.Expression;
import team.cn.exam.service.ExpressionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 生成运算式<br>
 * create:2017-04-13 16:26
 *
 * @author zhou
 */
@Service
public class ExpressionServiceImpl implements ExpressionService {

    @Override
    public List<Expression> generate(int fws1, int fws2, String[] algorithm, int amount,String answer) {
        List<Expression> expressions=new ArrayList<Expression>();
        Random random = new Random();
        for (int i=0;answer=="N"&&i<amount;i++){
            int operand1 = random.nextInt(fws2 - fws1) + fws1;
            int operand2 = random.nextInt(fws2 - fws1) + fws1;
            int x = random.nextInt(algorithm.length);

            Expression expression=new Expression();
            expression.setOperand1(operand1);
            expression.setOperand2(operand2);
            expression.setOperator(algorithm[x]);

            expressions.add(expression);
        }
/*        System.out.println(expressions.size());
        for(int j=0;j<expressions.size();j++){
            System.out.println(expressions.get(j).getOperand1()+expressions.get(j).getOperator()+expressions.get(j).getOperand2());
        }*/
        return expressions;
    }
}
