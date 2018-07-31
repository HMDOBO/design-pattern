package com.pattern.h_Iterator.example.restaurant;

import com.pattern.h_Iterator.example.caidan.Menu;
import com.pattern.h_Iterator.example.iterator.Iterator;
import com.pattern.h_Iterator.example.iterator.impl.JianBingIterator;

public class JianBingRestaurant {

    Menu[] menus;

    private String desc;
    private int length = 10;

    public JianBingRestaurant() {
        this.menus = new Menu[3];
        menus[0] = new Menu("彩虹煎饼", "彩虹颜色，好吃", 12.00);
        menus[1] = new Menu("经典煎饼", "经典颜色，好吃", 10.00);
        menus[2] = new Menu("双蛋煎饼", "两颗鸡蛋，好吃", 13.00);
    }

    public Iterator createInterator() {
        return new JianBingIterator(menus);
    }

    public Menu[] getMenus() {
        return menus;
    }

    public void setMenus(Menu[] menus) {
        this.menus = menus;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
