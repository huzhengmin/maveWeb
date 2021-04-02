package com.gaotai.factoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 9:02
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape rectngle = sf.getShape("Rectangle");
        rectngle.draw();
        Shape square = sf.getShape("square");
        square.draw();
        Square sq = new Square();
        sq.draw("name");
    }
}
