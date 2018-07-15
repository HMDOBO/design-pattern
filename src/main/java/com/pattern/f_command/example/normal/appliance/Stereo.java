package com.pattern.f_command.example.normal.appliance;

/**
 * 音响
 */
public class Stereo {

    private String desc;

    public Stereo(String desc) {
        this.desc = desc;
    }

    public void on() {
        System.out.println("打开" + desc);
    }

    public void setCD() {
        System.out.println("放入CD");
    }

    public void setVolume(int volume) {
        System.out.println("音量设置为" + volume);
    }

    public void off() {
        System.out.println("关闭" + desc);
    }

}
