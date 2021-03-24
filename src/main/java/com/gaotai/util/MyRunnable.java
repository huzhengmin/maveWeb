package com.gaotai.util;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author： hzm
 * @date： 2021/3/11 15:36
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {

        for (int i=0;i<10;i++)
        {

                System.out.println(i);


            try {
                Thread.sleep( 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {


        Thread t = new Thread(new MyRunnable());
        Thread t1 = new Thread(new MyRunnable());
        // 启动线程
        t.start();
        t1.start();
    }
}
