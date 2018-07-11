package com.pattern.factory.MethodFactory.store;

import com.pattern.factory.MethodFactory.pizza.NYStyleCheesePizza;
import com.pattern.factory.MethodFactory.pizza.NYStyleClamPizza;
import com.pattern.factory.SimpleFactory.Pizza;

/**
 * 纽约风味PizzaStore
 *
 * 制作纽约风味Pizza，关键在于createPizza方法返回Pizza类型不同
 *
 */
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }

}
