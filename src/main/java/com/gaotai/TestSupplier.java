package com.gaotai;

import java.util.function.Supplier;

/**
 * @author： hzm
 * @date： 2021/2/26 14:11
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class TestSupplier {
    private int age;

    public static void test(){
        System.out.println("Java8新特性，Supplier");
    }

    TestSupplier(){
        System.out.println("构造函数,age,"+age);
    }

    public static void main(String[] args) {
        //创建Supplier容器，声明为TestSupplier类型，此时并不会调用对象的构造方法，即不会创建对象
        Supplier<TestSupplier> sup= TestSupplier::new;
//         sup.get();
         test();
        System.out.println("--------");
        //调用get()方法，此时会调用对象的构造方法，即获得到真正对象
        //sup.get();
        //每次get都会调用构造方法，即获取的对象不同
        System.out.println("是否是相同的对象实例"+sup.get()==sup.get().toString());
    }

}
