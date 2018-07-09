package com.pattern.decorate.example.decorators;

import com.pattern.decorate.example.Beverage;

/**
 * 实际装饰者
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Double cost() {
        return .20 + beverage.cost();
    }   // 对具体行为装饰，也就是前后加操作
}
