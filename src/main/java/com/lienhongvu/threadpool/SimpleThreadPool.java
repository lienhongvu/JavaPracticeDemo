package com.lienhongvu.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hvlien on 8/16/2018.
 */
public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new WorkerRunnable("Run Device " + i));
        }

        executorService.shutdown();

        /* Use this way to check executor terminated or not
        while(!executorService.isTerminated()){
            System.out.println("NOT TERMINATED YET, " + executorService.isTerminated());
        }
        System.out.println("TERMINATED YET, " + executorService.isTerminated());*/

        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished all Works");
    }
}
