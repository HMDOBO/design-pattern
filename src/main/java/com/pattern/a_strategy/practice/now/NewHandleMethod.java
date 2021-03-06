package com.pattern.a_strategy.practice.now;

import com.pattern.a_strategy.practice.behavior.Calculate;
import com.pattern.a_strategy.practice.enmus.BehaviorEnum;

public class NewHandleMethod {

    public Integer calculate(int number1, int number2, String oper) {
//        Calculate calculate = null;

//        if ("add".equals(oper)) {
////            result = number1 + number2;
//            calculate = new AddCalculate();
//        } else if ("reduce".equals(oper)) {
//            calculate = new ReduceCalculate();
////            result = number1 - number2;
//        } else if ("mult".equals(oper)) {
//            calculate = new MultCalculate();
////            result = number1 * number2;
//        } else {
//            calculate = new ErrCalculate();
////            result = null;
//        }

        Calculate calculate = BehaviorEnum.getCalculate(oper);

        if (null == calculate) {
            return null;
        }
        return calculate.calculate(number1, number2);
    }

}
