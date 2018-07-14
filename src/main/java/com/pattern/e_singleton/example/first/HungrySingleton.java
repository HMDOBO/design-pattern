package com.pattern.e_singleton.example.first;

/**
 * 单件模式
 *
 * 饿汉式：类加载的时候创建
 *
 * 优点：是线程安全的，所以，如果不介意类加载的时候创建实例对象，那么这种方式很不错
 */
public class HungrySingleton {

    private static HungrySingleton instances = new HungrySingleton();   //

    private HungrySingleton(){}

    public static HungrySingleton getInstances() {
        return instances;
    }

}
