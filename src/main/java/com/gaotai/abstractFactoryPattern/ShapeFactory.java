package com.gaotai.abstractFactoryPattern;

import com.gaotai.factoryPattern.Rectangle;
import com.gaotai.factoryPattern.Shape;
import com.gaotai.factoryPattern.Square;

/**
 * @author： hzm
 * @date： 2021/3/29 9:23
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ShapeFactory  extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
