package com.pattern.d_factory.MethodFactory.store;

import com.pattern.d_factory.SimpleFactory.Pizza;

/**
 * 抽象PizzaStore
 */
public abstract class PizzaStore {

    /**
     * 制作流程是不变的，流程是制作的行为执行顺序
     *
     * 制作细节可以改变，细节是和Pizza类型有关
     *
     * @param type
     * @return
     */
    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 创建不同风味pizza
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);

}
