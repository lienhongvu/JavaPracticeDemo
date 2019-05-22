package com.lienhongvu.javaclass;

/**
 * Created by hvlien on 8/11/2017.
 */
public class MethodLocalInnerClassSample {

    private void doSomething(){
        final int i = 0;
        class LocalInner {
            public LocalInner() {
                if(i == 0){

                }
            }

            private void printSomething(){
                System.out.println("ahihi");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.printSomething();
    }

    public static void main(String[] args) {
        MethodLocalInnerClassSample localInnerClassSample = new MethodLocalInnerClassSample();
        localInnerClassSample.doSomething();
    }
}
