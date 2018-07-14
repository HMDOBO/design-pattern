package com.pattern.e_singleton.example.first;

/**
 * 单件模式
 *
 * 懒汉式：使用的时候再去创建
 */
public class LazySingleton {

    private static LazySingleton instances;

    private LazySingleton(){}

    public static LazySingleton getInstances() {
        if (instances == null)
            instances = new LazySingleton();
        return instances;
    }

}
