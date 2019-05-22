package com.lienhongvu.threadpool;

/**
 * Created by hvlien on 8/16/2018.
 */
public class WorkerRunnable implements Runnable {

    private String command;

    public WorkerRunnable(String command) {
        this.command = command;
    }

    @Override
    public void run() {

        System.out.println("START " + Thread.currentThread().getName());

        processCommand(this.command);

        System.out.println("END " + Thread.currentThread().getName());
    }

    private void processCommand(String command){
        System.out.println("PROCESSED COMMAND " + command);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
