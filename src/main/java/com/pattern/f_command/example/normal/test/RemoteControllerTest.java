package com.pattern.f_command.example.normal.test;

import com.pattern.f_command.example.normal.appliance.Light;
import com.pattern.f_command.example.normal.appliance.Stereo;
import com.pattern.f_command.example.normal.command.Command;
import com.pattern.f_command.example.normal.command.LightOffCommand;
import com.pattern.f_command.example.normal.command.LightOnCommand;
import com.pattern.f_command.example.normal.command.StereoOnWithCDCommand;
import com.pattern.f_command.example.normal.command.StereoOffWithCDCommand;
import com.pattern.f_command.example.normal.controller.RemoteController;

/**
 * 测试客户端
 */
public class RemoteControllerTest {

    public static void main(String[] args) {
        RemoteController controller = new RemoteController();   // 调用者，遥控器

        // 接受者
        Light livlingRoomLight = new Light("livlingRoomLight");
        Light kitchenLight = new Light("kitchenLight");
        Stereo stereo = new Stereo("living room");

        // 命令对象
        Command livlingRoomLightOn = new LightOnCommand(livlingRoomLight);
        Command livlingRoomLightOff = new LightOffCommand(livlingRoomLight);

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        Command stereoOn = new StereoOnWithCDCommand(stereo);
        Command stereoOff = new StereoOffWithCDCommand(stereo);

        controller.setCommand(0, livlingRoomLightOn, livlingRoomLightOff);
        controller.setCommand(1, kitchenLightOn, kitchenLightOff);
        controller.setCommand(2, stereoOn, stereoOff);

        System.out.println(controller.toString());

        controller.onButtWasPressed(0);
        controller.offButtWasPressed(0);
        controller.undoButtWasPressed();

        controller.onButtWasPressed(1);
        controller.offButtWasPressed(1);
        controller.undoButtWasPressed();

        controller.onButtWasPressed(2);
        controller.offButtWasPressed(2);
        controller.undoButtWasPressed();
    }

}
