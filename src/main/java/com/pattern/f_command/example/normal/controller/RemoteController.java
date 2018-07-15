package com.pattern.f_command.example.normal.controller;

import com.pattern.f_command.example.normal.command.Command;
import com.pattern.f_command.example.normal.command.NoCommand;

/**
 * 调用者，遥控器
 */
public class RemoteController {

    Command[] onCommands;   // 开按钮
    Command[] offCommands;  // 关按钮

    public RemoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {              // 7个slot插槽
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {   // slot插槽
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtWasPressed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n remote controller \n");
        for (int i = 0; i < 7; i++) {
            sb.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }

}
