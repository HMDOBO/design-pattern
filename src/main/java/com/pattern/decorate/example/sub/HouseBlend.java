package com.pattern.decorate.example.sub;

import com.pattern.decorate.example.Beverage;
/**
 * 被装饰者
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    public Double cost() {
        return .89;
    }
}
