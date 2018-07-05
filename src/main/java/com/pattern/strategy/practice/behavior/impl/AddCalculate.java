package com.pattern.strategy.practice.behavior.impl;

import com.pattern.strategy.practice.behavior.Calculate;

public class AddCalculate implements Calculate {
    public Integer calculate(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }
}
