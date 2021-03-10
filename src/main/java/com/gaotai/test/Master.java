package com.gaotai.test;

/**
 * @author： hzm
 * @date： 2021/3/10 11:59
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Master {
    public static void feed(Pet pet) {
        System.out.println("主人开始喂食");
        pet.eat();
        System.out.println("主人喂食结束");
    }


    public static void main(String[] args) {
        Pet cat = new Cat("汤姆");
        Pet dog = new Dog("高菲");
        feed(cat);
        feed(dog);
        Dog d = (Dog) dog;
        d.show();
    }
}
