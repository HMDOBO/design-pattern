package com.pattern.decorate.practice.decorators;

import com.pattern.decorate.practice.sup.PictureHandler;

/**
 * 装饰者
 *
 * 添加 特效
 *
 */
public class SpecialEffects extends PictureProcessor {

    protected PictureHandler pictureHandler;

    public SpecialEffects(PictureHandler pictureHandler) {
        this.pictureHandler = pictureHandler;
    }

    public String getDescription() {
        return pictureHandler.getDescription() + ", 特效";
    }

    public String handler(String img) {
        return pictureHandler.handler(img) + "-> 特效";
    }
}
