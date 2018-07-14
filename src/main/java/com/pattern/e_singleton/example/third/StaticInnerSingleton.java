package com.pattern.e_singleton.example.third;

/**
 * 静态内部类实现单例模式
 *
 * 也是懒汉式的一种
 *
 * 其实这种模式和双重检查锁相比效率相同，只是实现方式不同而已
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {}

    /**
     * 内部类，不会随着StaticInnerSingleton加载而加载，只有使用到的时候，才会去加载
     */
    private static class InnerClass {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.instance;
    }

}
