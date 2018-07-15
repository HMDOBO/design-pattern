package com.pattern.f_command.example.normal.appliance;

/**
 * 接受者、执行对象
 */
public class Light {

    private String desc;

    public Light(String desc) {
        this.desc = desc;
    }

    public void on() {
        System.out.println("打开" + desc + "灯");
    }

    public void off() {
        System.out.println("关闭" + desc + "灯");
    }

}
