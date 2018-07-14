package com.pattern.c_decorate.practice.decorators;

import com.pattern.c_decorate.practice.sup.PictureHandler;

/**
 * 装饰者
 * <p>
 * 添加 水印
 */
public class Watermark extends PictureProcessor {

    protected PictureHandler pictureHandler;

    public Watermark(PictureHandler pictureHandler) {
        this.pictureHandler = pictureHandler;
    }

    public String getDescription() {
        return pictureHandler.getDescription() + ", 水印";
    }

    public String handler(String img) {
        return pictureHandler.handler(img) + "-> 水印";
    }
}
