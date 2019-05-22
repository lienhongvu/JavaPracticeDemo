package com.lienhongvu.javaclass;

/**
 * Created by hvlien on 8/11/2017.
 */
public class StaticNestedClassSample {

    private static int count = 0;
    private int sum = 0;


    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.increaseNumberOfNestedClass();
    }

    static class NestedClass extends StaticNestedClassSample{

        private int numberOfNestedClass = 2;

        private void increaseNumberOfNestedClass() {
            // Nested class cannot read private members or other members of outer class. Except static
            // numberOfNestedClass = numberOfNestedClass + sum; We cannot do like this

            // Nested class can only access static members
            numberOfNestedClass = numberOfNestedClass + count;
            System.out.println(numberOfNestedClass);
        }
    }
}