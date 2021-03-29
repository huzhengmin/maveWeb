package com.gaotai.abstractFactoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 9:26
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
