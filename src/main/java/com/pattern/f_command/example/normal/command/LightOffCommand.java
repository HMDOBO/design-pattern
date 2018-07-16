package com.pattern.f_command.example.normal.command;

import com.pattern.f_command.example.normal.appliance.Light;

/**
 * 命令对象实现，
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }

}