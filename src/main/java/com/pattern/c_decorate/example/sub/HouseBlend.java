package com.pattern.c_decorate.example.sub;

import com.pattern.c_decorate.example.Beverage;
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
