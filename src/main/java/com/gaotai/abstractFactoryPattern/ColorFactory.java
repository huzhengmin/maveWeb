package com.gaotai.abstractFactoryPattern;

import com.gaotai.factoryPattern.Shape;

/**
 * @author： hzm
 * @date： 2021/3/29 9:25
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
