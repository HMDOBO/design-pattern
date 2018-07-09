package com.pattern.decorate.example.sub;

import com.pattern.decorate.example.Beverage;

/**
 * 被装饰者
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public Double cost() {
        return 1.99;
    }
}
