package com.lienhongvu.javaconcurrent.reentrantlock;

public class ReenTrantLockDemo {

    private EnvironmentClass environment = new EnvironmentClass();

    private TestExecutionManager executionManager;

    public ReenTrantLockDemo() {
        executionManager = new TestExecutionManager("testId");
    }

    protected void acquireLock() {
        environment.getLock().lock();
    }

    protected void releaseLock(){
        environment.getLock().unlock();
    }

    public EnvironmentClass getEnvironment() {
        return environment;
    }

    public void setEnvironment(EnvironmentClass environment) {
        this.environment = environment;
    }

    public TestExecutionManager getExecutionManager() {
        return executionManager;
    }

    public void setExecutionManager(TestExecutionManager executionManager) {
        this.executionManager = executionManager;
    }

    public static void main(String[] args) throws Exception {
        ReenTrantLockDemo reenTrantLockDemo = new ReenTrantLockDemo();
        reenTrantLockDemo.executionManager.runInBackground(() -> {
            reenTrantLockDemo.acquireLock();
            Thread.sleep(1000);
            System.out.println("Thread 1 done: " + Thread.currentThread().getName());
//            reenTrantLockDemo.releaseLock();
            return "done";
        });

        Thread.sleep(1000);

        reenTrantLockDemo.executionManager.runInBackground(() -> {
//            reenTrantLockDemo.acquireLock();
            Thread.sleep(1000);
            System.out.println("Thread 2 done: " + Thread.currentThread().getName());
            return "done";
        });

        Thread.sleep(1000);

        reenTrantLockDemo.executionManager.runInBackground(() -> {
            reenTrantLockDemo.releaseLock();
            Thread.sleep(1000);
            System.out.println("Thread 3 done: " + Thread.currentThread().getName());
            return "done";
        });
    }
}
