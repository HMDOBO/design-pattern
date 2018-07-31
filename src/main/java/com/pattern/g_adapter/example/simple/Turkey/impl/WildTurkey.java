package com.pattern.g_adapter.example.simple.Turkey.impl;

import com.pattern.g_adapter.example.simple.Turkey.Turkey;

/**
 * 火鸡类
 *
 * 现在要把火鸡的接口 “适配” 成鸭子接口
 *
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}
