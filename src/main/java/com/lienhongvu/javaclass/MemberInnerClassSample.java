package com.lienhongvu.javaclass;

/**
 * Created by hvlien on 8/11/2017.
 */
public class MemberInnerClassSample {

    private int count = 0;

    public static void main(String[] args) {
        MemberInnerClassSample outerClass = new MemberInnerClassSample();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.increaseNumberOfInnerClass();
    }

    class InnerClass {

        private int numberOfInnerClass = 2;

        private void increaseNumberOfInnerClass() {
            // Inner class can read private member of outer class
            numberOfInnerClass = numberOfInnerClass + count;
            System.out.println(numberOfInnerClass);
        }
    }
}