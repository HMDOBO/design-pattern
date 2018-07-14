package com.pattern.d_factory.AbstractFactory.pizza;

import com.pattern.d_factory.AbstractFactory.material.PizzaIngredientFactory;

public abstract class Pizza {

    protected String name;
    protected String desc;

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public abstract void prepare();

    public void cut() {
        System.out.println("cut...");
    }

    public void bake() {
        System.out.println("bake...");
    }

    public void packing(){
        System.out.println("packing...");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
