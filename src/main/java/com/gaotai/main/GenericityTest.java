package com.gaotai.main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author： hzm
 * @date： 2021/3/31 10:18
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class GenericityTest<T, T1, T2> {
    private T t;
    private T1 t1;
    private T2 t2;

    public void add(T t, T1 t1, T2 t2) {
        this.t = t;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T get() {
        return t;
    }

    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    //类型通配符一般是使用?代替具体的类型参数。
    // 例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
    public static void getUperNumber(List<? extends  Number> data) {
        System.out.println("data :" + data.get(0));
    }
    public static void main(String args[]) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

        //getUperNumber(name);
        getUperNumber(age);
        getUperNumber(number);
//        GenericityTest<Integer, String, String> integerBox = new GenericityTest<Integer, String, String>();
//        GenericityTest<Integer, String, Date> stringBox = new GenericityTest<Integer, String, Date>();
//
//        integerBox.add(new Integer(10), "gao", "tai");
//        //stringBox.add(new String("菜鸟教程"));
//        System.out.println(integerBox.get() + integerBox.getT1() + integerBox.getT2());
//        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        //System.out.printf("字符串为 :%s\n", stringBox.get());

//        // 创建不同类型数组： Integer, Double 和 Character
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
//        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//
//        System.out.println("整型数组元素为:");
//        printArray(intArray); // 传递一个整型数组
//
//        System.out.println("\n双精度型数组元素为:");
//        printArray(doubleArray); // 传递一个双精度型数组
//
//        System.out.println("\n字符型数组元素为:");
//        printArray(charArray); // 传递一个字符型数组
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
