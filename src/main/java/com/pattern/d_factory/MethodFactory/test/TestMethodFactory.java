package com.pattern.d_factory.MethodFactory.test;

import com.pattern.d_factory.MethodFactory.store.ChicagoPizzaStore;
import com.pattern.d_factory.MethodFactory.store.NYPizzaStore;
import com.pattern.d_factory.SimpleFactory.Pizza;

public class TestMethodFactory {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheesePizza = chicagoPizzaStore.orderPizza("cheese");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza clamPizza = nyPizzaStore.orderPizza("clam");

    }
}
