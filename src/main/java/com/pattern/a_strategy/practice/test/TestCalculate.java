package com.pattern.a_strategy.practice.test;

import com.pattern.a_strategy.practice.now.NewHandleMethod;

public class TestCalculate {

    public static void main(String[] args) {
//        OriginalHandleMethod handleMethod = new OriginalHandleMethod();
//        Integer result = handleMethod.calculate(1, 3, "add");
//        System.out.println(result);

        NewHandleMethod handleMethod = new NewHandleMethod();
        Integer result = handleMethod.calculate(5, 3, "mult");
        System.out.println(result);
    }

}
