package com.gaotai.test.thread;

/**
 * @author： hzm
 * @date： 2021/3/31 11:43
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class ThreadRunnable  implements Runnable  {
    private Thread t;
    private String threadName;

    ThreadRunnable(String name) {
        threadName = name;
        System.out.println("创建 " + threadName);
    }

    @Override
    public void run() {
        System.out.println("运行 " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("线程: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("线程 " + threadName + " interrupted.");
        }
        System.out.println("线程 " + threadName + " 结束.");
    }
    public void start () {
        System.out.println("运行 " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

