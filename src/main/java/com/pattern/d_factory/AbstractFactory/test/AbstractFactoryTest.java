package com.pattern.d_factory.AbstractFactory.test;

import com.pattern.d_factory.AbstractFactory.store.NYPizzaStore;
import com.pattern.d_factory.AbstractFactory.store.PizzaStore;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }

}
