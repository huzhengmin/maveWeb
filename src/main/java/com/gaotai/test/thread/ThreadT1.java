package com.gaotai.test.thread;

/**
 * @author： hzm
 * @date： 2021/3/31 14:16
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ThreadT1  extends  Thread{
    @Override
    public void run() {
        System.out.println("ThreadT1 运行. "   );
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread:OK--->  " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {

        }
        System.out.println("ThreadT1 运行结束g.");
    }
}
