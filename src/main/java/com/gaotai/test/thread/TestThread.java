package com.gaotai.test.thread;

/**
 * @author： hzm
 * @date： 2021/3/31 11:46
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class TestThread {
    public static void main(String[] args) {
        ThreadRunnable R1 = new ThreadRunnable( "线程-1");
        R1.start();

        ThreadRunnable R2 = new ThreadRunnable( "线程-2");
        R2.start();
    }
}
