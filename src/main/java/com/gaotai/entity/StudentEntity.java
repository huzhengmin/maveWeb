package com.gaotai.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author： hzm
 * @date： 2021/3/2 10:15
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
@Component
public class StudentEntity {
    public String getName() {
        return name;
    }
    @Value("张三1")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Value("191")
    public void setAge(Integer age) {
        this.age = age;
    }


    private  String name;

    private  Integer age;

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
}
