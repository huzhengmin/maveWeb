package com.gaotai.test.thread;

/**
 * @author： hzm
 * @date： 2021/3/31 12:00
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ThreadDemo {
    public static void main(String args[]) {
        ThreadExtend T1 = new ThreadExtend( "Thread-1");
        T1.start();

        ThreadExtend T2 = new ThreadExtend( "Thread-2");
        T2.start();
    }
}
