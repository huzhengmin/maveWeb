package com.gaotai.test.thread;

/**
 * @author： hzm
 * @date： 2021/3/31 14:11
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        ThreadT1 t1 = new ThreadT1();
        ThreadT1 t2 = new ThreadT1();
        t2.start();
        t1.start();
    }
}
