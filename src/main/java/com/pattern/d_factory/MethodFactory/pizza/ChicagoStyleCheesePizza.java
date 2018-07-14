package com.pattern.d_factory.MethodFactory.pizza;

import com.pattern.d_factory.SimpleFactory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
    }

    public void cut() {
        System.out.println("cut 方形");
    }
}
