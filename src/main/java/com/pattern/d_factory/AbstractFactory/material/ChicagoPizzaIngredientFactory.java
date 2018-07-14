package com.pattern.d_factory.AbstractFactory.material;

/**
 * 抽象工厂的具体实现
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    public String createName() {
        return "CHICAGO_NAME";
    }

    public String createDesc() {
        return "CHICAGO_DESC";
    }

}
