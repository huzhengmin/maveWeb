package com.gaotai.abstractFactoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 9:18
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Red  implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
