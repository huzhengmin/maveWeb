package com.gaotai;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author： hzm
 * @date： 2021/2/18 14:38
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
@Controller("hello")
public class HelloWorld {
    private Integer age;
    private String name;
    //@Required
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    //@Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void message()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "HelloWorld_hello{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';

    }

}
