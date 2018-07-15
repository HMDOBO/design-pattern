package com.pattern.f_command.example.simple.command;

import com.pattern.f_command.example.simple.appliance.Light;

/**
 * 命令对象实现
 */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

}
