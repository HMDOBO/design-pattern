package com.pattern.g_adapter.example.simple.test;

import com.pattern.g_adapter.example.simple.Turkey.Turkey;
import com.pattern.g_adapter.example.simple.Turkey.impl.WildTurkey;
import com.pattern.g_adapter.example.simple.adapter.TurkeyAdapter;
import com.pattern.g_adapter.example.simple.duck.Duck;

public class SimpleAdapterTest {

    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }

}
