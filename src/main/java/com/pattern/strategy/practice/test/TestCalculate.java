package com.pattern.strategy.practice.test;

import com.pattern.strategy.practice.now.NewHandleMethod;
import com.pattern.strategy.practice.original.OriginalHandleMethod;

public class TestCalculate {

    public static void main(String[] args) {
//        OriginalHandleMethod handleMethod = new OriginalHandleMethod();
//        Integer result = handleMethod.calculate(1, 3, "add");
//        System.out.println(result);

        NewHandleMethod handleMethod = new NewHandleMethod();
        Integer result = handleMethod.calculate(1, 3, "add");
        System.out.println(result);
    }

}
