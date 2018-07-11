package com.pattern.factory.SimpleFactory;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing" + name);
    }

    public void bake() {
        System.out.println("bake for 25min");
    }

    public void cut() {
        System.out.println("cut 三角形");
    }

    public void box() {
        System.out.println("装盒");
    }

}
