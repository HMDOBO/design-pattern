package com.pattern.d_factory.AbstractFactory.material;

/**
 * 抽象工厂的具体实现
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    public String createName() {
        return "NY_NAME";
    }

    public String createDesc() {
        return "NY_DESC";
    }

}
