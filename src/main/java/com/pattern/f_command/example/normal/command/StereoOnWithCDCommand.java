package com.pattern.f_command.example.normal.command;

import com.pattern.f_command.example.normal.appliance.Stereo;
/**
 * 开音响的命令对象
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
