package com.pattern.e_singleton.practice.threadpool;

import com.pattern.e_singleton.practice.thread.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 线程池类，对线程进行管理，同时提供线程
 *
 * 一个系统通常只能有一个线程池，所以要用单例实现
 *
 */
public class ThreadPool {

    private volatile static ThreadPool instances;

    private ThreadPool() {  // 私有构造，初始化threads集合
        threads = new ArrayList<Thread>();
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(i + "", "desc_" + i, true);
            threads.add(thread);
        }
    }

    public static ThreadPool getInstances() {
        if (instances == null) {
            synchronized (ThreadPool.class) {
                if (instances == null)
                    instances = new ThreadPool();
            }
        }
        return instances;
    }

    private volatile static List<Thread> threads;

    /**
     * 获取线程，同时将thread线程free标记为false
     * @return
     */
    public synchronized Thread getThread() {
        for (Thread thread: threads) {
            if (thread.isFree()) {
                System.out.println("====获取到了thread====" + thread);
                thread.setFree(false);
                return thread;
            }
        }
//        throw new RuntimeException("当前线程池没有空闲线程");
        System.out.println("当前线程池没有空闲线程");
        return null;
    }


}
