package com.gaotai.test;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Objects;

/**
 * @author： hzm
 * @date： 2021/3/10 11:48
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public abstract class Pet {


    String name;

    public Pet() {

    }

    public Pet(String name) {
        this.name = "Pet" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public abstract void eat();


}
