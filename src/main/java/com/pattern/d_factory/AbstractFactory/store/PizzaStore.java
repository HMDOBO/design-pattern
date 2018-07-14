package com.pattern.d_factory.AbstractFactory.store;

import com.pattern.d_factory.AbstractFactory.pizza.Pizza;

/**
 * 抽象pizza店
 */
public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();

        pizza.cut();

        pizza.bake();

        pizza.packing();

    }

    protected abstract Pizza createPizza(String type);

}
