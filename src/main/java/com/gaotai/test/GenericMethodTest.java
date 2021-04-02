package com.gaotai.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： hzm
 * @date： 2021/3/30 16:49
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class GenericMethodTest {
    // 泛型方法 printArray
    public static <T> T[]  printArray(T[] inputArray) {
        // 输出数组元素
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
        return inputArray ;
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        List<Dog> al = new ArrayList<>();
        al.add(new Dog("汤姆"));
        al.add(new Dog("柯特"));
         printArray(al.toArray());

        System.out.println("整型数组元素为:");
        Integer[] it = printArray(intArray); // 传递一个整型数组
        System.out.println(it[0]);
        System.out.println("\n双精度型数组元素为:");
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("\n字符型数组元素为:");
        printArray(charArray); // 传递一个字符型数组
    }
}
