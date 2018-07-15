package com.pattern.f_command.example.simple.test;

import com.pattern.f_command.example.simple.appliance.Light;
import com.pattern.f_command.example.simple.command.Command;
import com.pattern.f_command.example.simple.command.LightOnCommand;
import com.pattern.f_command.example.simple.controller.SimpleRemoteController;

/**
 * 客户
 */
public class SimpleCommandTest {

    public static void main(String[] args) {
        SimpleRemoteController controller = new SimpleRemoteController();   // 调用者

        Light light = new Light();  // 接受者

        // 接受者放入命令对象中
        Command command = new LightOnCommand(light);    // 命令对象

        // 命令对象放入调用者，供调用者调用
        controller.setSlot(command);

        // 调用者调用命令对象的execute方法
        controller.buttonWasPressed();

    }

}
