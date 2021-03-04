package com.gaotai;

/**
 * @author： hzm
 * @date： 2021/2/24 9:49
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void temp(String s) {


    }
}
