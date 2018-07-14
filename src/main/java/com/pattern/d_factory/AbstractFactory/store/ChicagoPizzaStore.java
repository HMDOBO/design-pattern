package com.pattern.d_factory.AbstractFactory.store;

import com.pattern.d_factory.AbstractFactory.material.ChicagoPizzaIngredientFactory;
import com.pattern.d_factory.AbstractFactory.material.PizzaIngredientFactory;
import com.pattern.d_factory.AbstractFactory.pizza.CheesePizza;
import com.pattern.d_factory.AbstractFactory.pizza.Pizza;

/**
 * 纽约pizza店
 */
public class ChicagoPizzaStore extends PizzaStore{

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPizzaStore() {
        pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    }

    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if ("clam".equals(type)) {

        }

        return null;
    }


}
