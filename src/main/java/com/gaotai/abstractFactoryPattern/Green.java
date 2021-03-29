package com.gaotai.abstractFactoryPattern;

/**
 * @author： hzm
 * @date： 2021/3/29 9:19
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
