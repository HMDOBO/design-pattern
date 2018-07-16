package com.pattern.f_command.example.normal.command;

import com.pattern.f_command.example.normal.appliance.Stereo;

/**
 * 关音响的命令对象
 */
public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
