package com.pattern.g_adapter.example.simple.adapter;

import com.pattern.g_adapter.example.simple.Turkey.Turkey;
import com.pattern.g_adapter.example.simple.duck.Duck;

/**
 * 适配器
 *
 * 因为要是配成Duck类，所以适配器也要实现Duck
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
