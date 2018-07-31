package com.pattern.h_Iterator.example.restaurant;

import com.pattern.h_Iterator.example.caidan.Menu;
import com.pattern.h_Iterator.example.iterator.Iterator;
import com.pattern.h_Iterator.example.iterator.impl.WuCanIterator;

import java.util.ArrayList;
import java.util.List;

public class WuCanRestaurant {

    List<Menu> menuList;
    private String description;

    public WuCanRestaurant() {
        this.menuList = new ArrayList<Menu>();
        menuList.add(new Menu("蛋炒饭", "蛋炒饭，好吃", 20.00));
        menuList.add(new Menu("黄焖鸡", "黄焖鸡，好吃", 25.00));
        menuList.add(new Menu("鱼香肉丝", "鱼香肉丝，好吃", 24.00));
    }

    public Iterator createInterator() {
        return new WuCanIterator(menuList);
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
