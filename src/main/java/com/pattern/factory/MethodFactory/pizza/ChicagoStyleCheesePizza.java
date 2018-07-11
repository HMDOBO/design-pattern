package com.pattern.factory.MethodFactory.pizza;

import com.pattern.factory.SimpleFactory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
    }

    public void cut() {
        System.out.println("cut 方形");
    }
}
