package com.gaotai.factoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 8:56
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Square  implements  Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
    public  void draw(String name)
    {
        System.out.println(String.format("画了{0}",name));
    }
}
