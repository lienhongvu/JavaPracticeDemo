package com.lienhongvu.javaconcurrent;

import java.text.SimpleDateFormat;

/**
 * Created by hvlien on 8/15/2018.
 */
public class ThreadLocalTest implements Runnable{

    private static final ThreadLocal<SimpleDateFormat> formatterThreadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("HH:MM"));

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadLocalTest());
        thread.start();
        System.out.println("Started Thread");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended All Thread");
    }

    @Override
    public void run() {
        System.out.println(formatterThreadLocal.get().toPattern());
    }
}
