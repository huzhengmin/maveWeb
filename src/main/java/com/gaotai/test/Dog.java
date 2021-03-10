package com.gaotai.test;

/**
 * @author： hzm
 * @date： 2021/3/10 11:57
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        //this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + ",在啃骨头");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("name==" + name);
        System.out.println("this.name==" + this.name);
        System.out.println("super.name==" + super.name);
        System.out.println(name + "-show");
    }
}
