package com.pattern.h_Iterator.example.iterator.impl;

import com.pattern.h_Iterator.example.caidan.Menu;
import com.pattern.h_Iterator.example.iterator.Iterator;

public class JianBingIterator implements Iterator {

    Menu[] menus;
    private int option = 0;

    public JianBingIterator(Menu[] menus) {
        this.menus = menus;
    }

    public boolean hasNext() {
        return option < menus.length && menus[option] != null;
    }

    public Object next() {
        Menu menu = menus[option];
        option ++;
        return menu;
    }
}
