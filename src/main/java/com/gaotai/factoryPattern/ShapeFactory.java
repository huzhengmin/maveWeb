package com.gaotai.factoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 8:57
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}

