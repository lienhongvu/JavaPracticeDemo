package com.lienhongvu.recursion;

/**
 * Created by hvlien on 10/30/2018.
 */
public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        System.out.println(recursionTest.factorial(5));
        System.out.println(recursionTest.fibonacciMethod1(5));
        System.out.println(recursionTest.fibonacciMethod2(9));
    }

    private int factorial(int number){
        if(number == 1) {
            return 1;
        }
        return number * (factorial(number - 1));
    }

    /*
    Use recursion to calculate fibonacci
     */
    private int fibonacciMethod1(int number){

        if(number <= 1){
            return number;
        }
        return (fibonacciMethod1(number - 1) + fibonacciMethod1(number - 2));
    }

    /*
    Use loop to calculate fibonacci
     */
    private int fibonacciMethod2(int number){

        int temp = 0;
        while (number >= 1){
            temp = number;
            while(temp >= 1) {

                temp--;
            }

            number--;
        }
        return number;
    }

}
