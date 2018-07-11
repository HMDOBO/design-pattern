package com.pattern.factory.MethodFactory.test;

import com.pattern.factory.MethodFactory.store.ChicagoPizzaStore;
import com.pattern.factory.MethodFactory.store.NYPizzaStore;
import com.pattern.factory.SimpleFactory.Pizza;

public class TestMethodFactory {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheesePizza = chicagoPizzaStore.orderPizza("cheese");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza clamPizza = nyPizzaStore.orderPizza("clam");

    }
}
