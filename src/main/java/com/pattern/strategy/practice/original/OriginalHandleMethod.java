package com.pattern.strategy.practice.original;

public class OriginalHandleMethod {


    public Integer calculate(int number1, int number2, String oper) {
        if (oper == null || oper == "") {
            return null;
        }

        Integer result;
        if (oper.equals("add")) {
            result = number1 + number2;
        } else if (oper.equals("reduce")) {
            result = number1 - number2;
        } else if (oper.equals("mult")) {
            result = number1 * number2;
        } else {
            result = null;
        }
        return result;
    }

}
