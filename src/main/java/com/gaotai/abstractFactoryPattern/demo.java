package com.gaotai.abstractFactoryPattern;

import com.gaotai.factoryPattern.Shape;

import javax.security.auth.login.Configuration;

/**
 * @author： hzm
 * @date： 2021/3/29 9:29
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class demo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");



        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();

        int i = 0;
        Integer iO= 1;
        System.out.println(i+"-->"+iO);
    }
}
