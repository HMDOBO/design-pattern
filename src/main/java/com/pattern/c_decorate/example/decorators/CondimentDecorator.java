package com.pattern.c_decorate.example.decorators;

import com.pattern.c_decorate.example.Beverage;

/**
 * 抽象装饰者
 *
 * 要继承饮料类Beverage，保证装饰后的对象还属Beverage类，这很重要
 *
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
