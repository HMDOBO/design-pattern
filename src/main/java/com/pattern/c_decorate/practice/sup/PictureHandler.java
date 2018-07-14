package com.pattern.c_decorate.practice.sup;

/**
 * 图片处理超类
 *
 */
public abstract class PictureHandler {

    protected String description = "PictureHandler";

    public abstract String getDescription();

    public abstract String handler(String img);

}
