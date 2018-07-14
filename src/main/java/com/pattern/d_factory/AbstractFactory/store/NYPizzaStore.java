package com.pattern.d_factory.AbstractFactory.store;

import com.pattern.d_factory.AbstractFactory.material.NYPizzaIngredientFactory;
import com.pattern.d_factory.AbstractFactory.material.PizzaIngredientFactory;
import com.pattern.d_factory.AbstractFactory.pizza.CheesePizza;
import com.pattern.d_factory.AbstractFactory.pizza.ClamPizza;
import com.pattern.d_factory.AbstractFactory.pizza.Pizza;

/**
 * 纽约pizza店
 */
public class NYPizzaStore extends PizzaStore{

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NYPizzaStore() {
        pizzaIngredientFactory = new NYPizzaIngredientFactory();
    }

    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        }

        return pizza;
    }


}
