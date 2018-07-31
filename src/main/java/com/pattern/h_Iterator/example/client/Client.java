package com.pattern.h_Iterator.example.client;

import com.pattern.h_Iterator.example.iterator.Iterator;
import com.pattern.h_Iterator.example.restaurant.JianBingRestaurant;
import com.pattern.h_Iterator.example.restaurant.WuCanRestaurant;

public class Client {

    JianBingRestaurant jianBingRestaurant;
    WuCanRestaurant wuCanRestaurant;

    public Client() {
        this.jianBingRestaurant = new JianBingRestaurant();
        this.wuCanRestaurant = new WuCanRestaurant();
    }

    public void println() {
//        Menu[] menus = jianBingRestaurant.getMenus();
//
//        List<Menu> menuList = wuCanRestaurant.getMenuList();
//
//        for (Menu menu: menus) {
//            System.out.println(menu);
//        }
//
//        System.out.println("================================================");
//
//        for (Menu menu: menuList) {
//            System.out.println(menu);
//        }

        Iterator jianBingInterator = jianBingRestaurant.createInterator();

        Iterator wuCanInterator = wuCanRestaurant.createInterator();

        println(jianBingInterator);
        println(wuCanInterator);

    }

    public void println(Iterator interator) {
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }
}
