package com.lienhongvu.javaconcurrent.volatilevariable;

import java.util.ArrayList;

/**
 * Created by hvlien on 8/9/2017.
 */
public class VolatileTest {

    private static volatile int count = 0;

    public static void main(String[] args) {
        CountListener listenerRunnable = new CountListener();
        IncreaseCountValue IncreaseCountValueRunnable = new IncreaseCountValue();
        listenerRunnable.start();
        IncreaseCountValueRunnable.start();
    }

    private static class CountListener implements Runnable {

        private Thread thread;

        public void run() {
            int i = count;
            while (i < 5) {
                if(i != count) {
                    System.out.println("Value change now: " + count);
                    i = count;
                }
            }
        }

        private void start(){
            thread = new Thread(this, "CountListener");
            thread.start();
        }
    }

    private static class IncreaseCountValue implements Runnable {

        private Thread thread;

        public void run() {
            int i = count;
            while(i < 5) {
                count = ++i;
                System.out.println("Increase value now: " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex){ex.printStackTrace();}
            }
        }

        private void start(){
            thread = new Thread(this, "CountListener");
            thread.start();
        }
    }
}
