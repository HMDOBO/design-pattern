package com.pattern.a_strategy.practice.behavior.impl;

import com.pattern.a_strategy.practice.behavior.Calculate;

public class ReduceCalculate implements Calculate {
    public Integer calculate(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }
}
