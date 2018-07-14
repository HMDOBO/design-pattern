package com.pattern.c_decorate.practice.test;

import com.pattern.c_decorate.practice.decorated.PictureUpload;
import com.pattern.c_decorate.practice.decorators.Blurry;
import com.pattern.c_decorate.practice.decorators.SpecialEffects;
import com.pattern.c_decorate.practice.decorators.Watermark;
import com.pattern.c_decorate.practice.sup.PictureHandler;

public class TestClass {

    public static void main(String[] args) {
        String img = new String ("我是一张图片");

        // 创建被装饰者
        PictureHandler handler = new PictureUpload();

        // 装饰的过程就是对行为进行扩展的过程

        // 开始装饰，行为开始扩展

        // 特效
        handler = new SpecialEffects(handler);
        // 模糊
        handler = new Blurry(handler);
        // 水印
        handler = new Watermark(handler);

        // 装饰完毕，行为扩展完毕

        // 使用装饰完毕的被装饰者

        img = handler.handler(img);

        System.out.println(img);
    }

}
