package com.pattern.c_decorate.example.decorators;

import com.pattern.c_decorate.example.Beverage;

/**
 * 实际装饰者
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public Double cost() {
        return .15 + beverage.cost();
    }
}
