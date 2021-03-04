package com.gaotai;

import java.util.ArrayList;
import java.util.List;

/**
 * @author： hzm
 * @date： 2021/3/1 17:40
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ThreadTemp {
    private static int number = 0;
    private static Object obj = new Object();
    public static void main(String[] args) throws InterruptedException {
        Runnable increment = () -> {
            for (int i = 0;i<10000;i++){
                number++;
//                synchronized (obj){
//                    number++;
//                }

            }
        };


        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(increment);
            t.start();
            list.add(t);
        }

        for (Thread t : list) {
            t.join();
        }

        System.out.println("number = " + number);
    }

}
