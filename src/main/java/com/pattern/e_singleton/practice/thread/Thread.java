package com.pattern.e_singleton.practice.thread;

/**
 * 模拟线程类，获取线程类要通过ThreadPool线程池
 *
 * 线程类也由ThreadPool来管理
 */
public class Thread {

    private String id;
    private String desc;
    private boolean free;

    public Thread() {
    }

    public Thread(String id, String desc, boolean free) {
        this.id = id;
        this.desc = desc;
        this.free = free;
    }

    public void close() {
        this.setFree(true);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Thread{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", free=" + free +
                '}';
    }
}
