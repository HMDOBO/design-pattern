package com.pattern.e_singleton.example.second;
/**
 * first中的LazySingleton（懒汉式）单例模式在多线程环境下不安全（饿汉式是线程安全的）
 *
 * 因此要对其进行优化，以能够在多线程环境中使用
 *
 * 通过使用synchronized同步锁机制来达到线程安全
 *
 * 但是如果synchronized加在方法上，每次getInstances获取实例，都会加锁
 *
 * 这样会拖垮整个系统性能，多线程环境也没有了意义
 *
 * 要知道，同步一个方法可能造成程序执行效率下降100倍
 */
public class Singleton {

    private static Singleton instances;

    private Singleton(){}

    /**
     * synchronized同步锁达到线程安全
     */
    public synchronized static Singleton getInstances() {
        if (instances == null)
            instances = new Singleton();
        return instances;
    }

}
