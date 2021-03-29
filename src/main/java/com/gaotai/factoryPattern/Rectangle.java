package com.gaotai.factoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 8:55
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
