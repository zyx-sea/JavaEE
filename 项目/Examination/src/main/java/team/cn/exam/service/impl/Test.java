package team.cn.exam.service.impl;

import team.cn.exam.model.Expression;
import team.cn.exam.service.ExpressionService;

import java.util.List;

/**
 * 测试<br>
 * create:2017-04-15 15:30
 *
 * @author zhou
 */
public class Test {

    public static void main(String[] args) {
/*
        int fws1 = 1;
        int fws2 = 10;
        String[] algorithm = new String[]{"+", "-","*","/"};
        int amount = 12;

        List<Expression> expressions=new ArrayList<Expression>();
        Random random = new Random();
        for (int i=0;i<amount;i++){
           int operand1 = random.nextInt(fws2 - fws1) + fws1;
            int operand2 = random.nextInt(fws2 - fws1) + fws1;
            int x = random.nextInt(4);
            *//*System.out.println(operand1+algorithm[x]+operand2+"=");*//*

            Expression expression=new Expression();
            expression.setOperand1(operand1);
            expression.setOperand2(operand2);
            expression.setOperator(algorithm[x]);

            expressions.add(expression);
      *//*      System.out.println(expressions.get(i).getOperand1()+expressions.get(i).getOperator()+expressions.get(i).getOperand2());*//*
        }
        System.out.println(expressions.size());
       for(int j=0;j<expressions.size();j++){
            System.out.println(expressions.get(j).getOperand1()+expressions.get(j).getOperator()+expressions.get(j).getOperand2());
        }*/

        ExpressionService expressionService=new ExpressionServiceImpl();
        List<Expression> expressions=expressionService.generate(1,12,new String []{"+", "-","*","/"},12,"N");
        for(int j=0;j<expressions.size();j++){
            System.out.println(expressions.get(j).getOperand1()+expressions.get(j).getOperator()+expressions.get(j).getOperand2());
        }

    }
}