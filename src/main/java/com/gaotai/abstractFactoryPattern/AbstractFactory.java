package com.gaotai.abstractFactoryPattern;
import com.gaotai.factoryPattern.Shape;
/**
 * @author： hzm
 * @date： 2021/3/29 9:20
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
