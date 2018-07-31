package com.pattern.h_Iterator.example.iterator.impl;

import com.pattern.h_Iterator.example.caidan.Menu;
import com.pattern.h_Iterator.example.iterator.Iterator;

import java.util.List;

public class WuCanIterator implements Iterator {

    List<Menu> menuList;
    private int option = 0;

    public WuCanIterator(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public boolean hasNext() {
        return option < menuList.size();
    }

    public Object next() {
        Menu menu = menuList.get(option);
        option ++;
        return menu;
    }
}
