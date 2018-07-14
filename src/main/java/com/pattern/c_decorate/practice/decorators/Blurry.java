package com.pattern.c_decorate.practice.decorators;

import com.pattern.c_decorate.practice.sup.PictureHandler;

/**
 * 装饰者
 * <p>
 * 添加 模糊
 */
public class Blurry extends PictureProcessor {

    protected PictureHandler pictureHandler;

    public Blurry(PictureHandler pictureHandler) {
        this.pictureHandler = pictureHandler;
    }

    public String getDescription() {
        return pictureHandler.getDescription() + ", 模糊";
    }

    public String handler(String img) {
        return pictureHandler.handler(img) + "-> 模糊";
    }
}
