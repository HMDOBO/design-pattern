package com.pattern.decorate.example.test;

import com.pattern.decorate.example.Beverage;
import com.pattern.decorate.example.decorators.Mocha;
import com.pattern.decorate.example.decorators.Soy;
import com.pattern.decorate.example.sub.Espresso;

public class TestClass {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();    // 创建被装饰者

        // 开始装饰

        beverage1 = new Mocha(beverage1);   // 将beverage1放入Mocha，beverage1被Mocha装饰，装饰后所属超类型不变

        beverage1 = new Soy(beverage1);     // 又将beverage1放入Soy

        // 装饰完毕

        // beverage1还是属于Beverage超类

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }

}
