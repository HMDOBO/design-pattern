package com.pattern.e_singleton.example.third;
/**
 * 双重检查加锁，这种方式已经能够达到最优单例模式实现
 *
 * 关键点：
 * <li>1. volatile关键字：确保多线程环境中每个线程对instances的引用都是实时的 </li>
 * <li>2. 双重检查：优化多线程执行效率，确保instances = new Singleton();在多线程环境只执行一次 </li>
 *
 * 优化second中synchronized同步锁机制
 * 不是每次getInstances都会走同步锁
 */
public class Singleton {
    private static Object lockObject = new Object();

    private volatile static Singleton instances;

    private Singleton(){}

    /**
     * 优化synchronized
     */
    public static Singleton getInstances() {
        if (instances == null) {
            synchronized(lockObject) {
                if (instances == null) {    // TODO 双重检查，这个判断很关键
                    instances = new Singleton();
                }
            }
        }
        return instances;
    }

}
