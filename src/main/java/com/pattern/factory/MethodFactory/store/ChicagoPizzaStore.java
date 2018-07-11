package com.pattern.factory.MethodFactory.store;

import com.pattern.factory.MethodFactory.pizza.ChicagoStyleCheesePizza;
import com.pattern.factory.MethodFactory.pizza.ChicagoStyleClamPizza;
import com.pattern.factory.SimpleFactory.Pizza;

/**
 * 纽约风味PizzaStore
 *
 * 制作纽约风味Pizza，关键在于createPizza方法返回Pizza类型不同
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }

}
