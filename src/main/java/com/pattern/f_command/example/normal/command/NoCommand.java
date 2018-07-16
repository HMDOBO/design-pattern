package com.pattern.f_command.example.normal.command;

/**
 * 空对象模式
 *
 * 什么也不做
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("执行execute方法");
    }

    public void undo() {

    }
}
