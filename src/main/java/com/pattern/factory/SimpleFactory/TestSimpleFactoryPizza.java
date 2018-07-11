package com.pattern.factory.SimpleFactory;

public class TestSimpleFactoryPizza {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = pizzaStore.orderPizza("cheese");

        System.out.println(pizza);
    }

}
