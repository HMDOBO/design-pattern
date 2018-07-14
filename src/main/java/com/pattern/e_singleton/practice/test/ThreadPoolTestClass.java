package com.pattern.e_singleton.practice.test;

import com.pattern.e_singleton.practice.thread.Thread;
import com.pattern.e_singleton.practice.threadpool.ThreadPool;

/**
 * 稳稳应对多线程环境中中获取ThreadPool以及Thread
 *
 */
public class ThreadPoolTestClass {

    public static void main(String[] args) {
        // 这里要用到ThreadPool线程池，那么就要获取到一个ThreadPool对象

        // 当我们new ThreadPool时发现，无法创建
        // new ThreadPool(); 不可用

        // 只通过ThreadPool对象对外提供的公有方法getInstances()
        ThreadPool threadPool = ThreadPool.getInstances();

        Thread thread1 = threadPool.getThread();
        Thread thread2 = threadPool.getThread();
        Thread thread3 = threadPool.getThread();
        Thread thread4 = threadPool.getThread();
        Thread thread5 = threadPool.getThread();

        System.out.println("============ThreadPool中thread用完了================");

        Thread thread6 = threadPool.getThread();
        Thread thread7 = threadPool.getThread();

        System.out.println("============thread归还================");
        if (thread1 != null) {
            thread1.close();
        }
        if (thread1 != null) {
            thread2.close();
        }

        Thread thread8 = threadPool.getThread();
        Thread thread9 = threadPool.getThread();

    }

}
