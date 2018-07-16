package com.pattern.f_command.example.normal.command;

import com.pattern.f_command.example.normal.appliance.Light;

/**
 * 命令对象实现，关灯的命令对象
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }

}
