package com.lienhongvu.javaconcurrent;

/**
 * Created by hvlien on 8/13/2018.
 */
public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println("Start Main Thread Now");
        MyThread myThread = new MyThread();
        myThread.run();

        // new Thread by using anonymous class
        Thread anonymousClass = new Thread() {
            @Override
            public void run() {
                super.run();
                System.out.println("Thread is created by using Anonymous class running");
            }
        };
        anonymousClass.start();

        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();

        Thread daemonThread = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("Daemon thread is running");
            }
        };
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            myThread.join();
            anonymousClass.join();
            runnableThread.join();
            daemonThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ended Main Thread");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("My Thread is running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My Thread finished");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is created by implement Runnable class running");
    }
}