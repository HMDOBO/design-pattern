package com.pattern.c_decorate.practice.decorated;

import com.pattern.c_decorate.practice.sup.PictureHandler;

/**
 * 被装饰者
 *
 * 图片上传功能
 */
public class PictureUpload extends PictureHandler {

    public PictureUpload() {
        description = "图片上传";
    }

    public String getDescription() {
        return description;
    }

    /**
     * 图片上传
     * @param img
     * @return
     */
    public String handler(String img) {
        return img + "-> 上传";
    }
}
