package com.pattern.c_decorate.example;

/**
 *
 *装饰者模式
 *
 * 饮料超类
 *
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

}
