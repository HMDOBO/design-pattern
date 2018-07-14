package com.pattern.d_factory.AbstractFactory.pizza;

import com.pattern.d_factory.AbstractFactory.material.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        this.name = pizzaIngredientFactory.createName();
        this.desc = pizzaIngredientFactory.createDesc();
    }

}
