package com.pattern.f_command.example.simple.appliance;

/**
 * 接受者、执行对象
 */
public class Light {

    public void on() {
        System.out.println("打开灯");
    }

    public void off() {
        System.out.println("关闭灯");
    }

}
