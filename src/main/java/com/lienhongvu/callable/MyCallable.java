package com.lienhongvu.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hvlien on 8/22/2018.
 */
public class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return "Thread : " + Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future> futureList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            MyCallable myCallable = new MyCallable();
            Future<String> future = executorService.submit(myCallable);
            futureList.add(future);
        }
        executorService.shutdown();
        futureList.forEach(future -> {
            try {
                String result = (String) future.get();
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
