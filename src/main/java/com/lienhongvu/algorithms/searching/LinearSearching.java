package com.lienhongvu.algorithms.searching;

/**
 * Created by hvlien on 11/8/2018.
 */
public class LinearSearching {
    public static void main(String[] args) {
        int[] array = {12, 1, 5, 20, 2, 1, 4, 8, 3};

        int searchNumber = 3;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchNumber) {
                System.out.println("Searched item at position " + (i+1) );
            }
        }
    }
}
