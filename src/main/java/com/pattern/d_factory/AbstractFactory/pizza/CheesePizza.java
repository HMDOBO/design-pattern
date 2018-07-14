package com.pattern.d_factory.AbstractFactory.pizza;

import com.pattern.d_factory.AbstractFactory.material.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        this.name = pizzaIngredientFactory.createName();
        this.desc = pizzaIngredientFactory.createDesc();
        System.out.println(this.name + ":" + this.desc);
    }

}
