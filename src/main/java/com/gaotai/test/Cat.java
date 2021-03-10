package com.gaotai.test;

/**
 * @author： hzm
 * @date： 2021/3/10 11:51
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Cat extends Pet {

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name) {
        super(name);
        //this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "，在吃鱼_");
    }
}
