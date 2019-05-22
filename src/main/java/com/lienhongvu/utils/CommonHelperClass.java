package com.lienhongvu.utils;

/**
 * Created by hvlien on 11/12/2018.
 */
public class CommonHelperClass {

    public static String toStringArray(int[] array) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            text.append(array[i]);
            if (i != array.length - 1) {
                text.append(" ");
            }
        }
        return text.toString();
    }

    public static void displayArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
