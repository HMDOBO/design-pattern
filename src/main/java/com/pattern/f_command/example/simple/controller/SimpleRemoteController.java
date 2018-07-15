package com.pattern.f_command.example.simple.controller;

import com.pattern.f_command.example.simple.command.Command;

/**
 * 简单调用者
 */
public class SimpleRemoteController {

    Command slot;

    public SimpleRemoteController() {}

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
