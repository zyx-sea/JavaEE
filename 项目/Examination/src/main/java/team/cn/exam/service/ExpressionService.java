package team.cn.exam.service;

import team.cn.exam.model.Expression;

import java.util.List;

/**
 * 算术式<br>
 * create:2017-04-13 16:22
 *
 * @author zhou
 * @version 1.0
 */
public interface ExpressionService {

    public List<Expression> generate(int fws1, int fws2, String[] algorithm, int amount,String answer);

}
