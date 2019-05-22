package com.lienhongvu.algorithms.sorting;

import com.lienhongvu.utils.CommonHelperClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hvlien on 11/8/2018.
 */
public class SelectionSorting {

    private void sortAscByWhile(int[] array) {
        int start = 0, positionOfMinValue = 0, loopTimes = 0;
        boolean swapped;
        do {
            swapped = false;
            for (int i = start + 1; i < array.length; i++) {
                if (array[i] < array[positionOfMinValue]) {
                    positionOfMinValue = i;
                }
                loopTimes++;
            }
            if (start != positionOfMinValue) {
                int temp = array[start];
                array[start] = array[positionOfMinValue];
                array[positionOfMinValue] = temp;

                start++;
                swapped = true;
            }

        } while (swapped);
        System.out.println("Times of loop for sortAscByWhile " + loopTimes);
    }

    private void sortAscByTwoLoops(int[] array) {
        int positionOfMinValue, loopTimes = 0, swapTimes = 0;
        for (int i = 0; i < array.length - 1; i++) {
            positionOfMinValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[positionOfMinValue]) {
                    positionOfMinValue = j;
                }
                loopTimes++;
            }
            if (positionOfMinValue != i) {
                int temp = array[i];
                array[i] = array[positionOfMinValue];
                array[positionOfMinValue] = temp;
                swapTimes++;
            }
        }

        System.out.println("loop times of sortAscByTwoLoops " + loopTimes);
        System.out.println("swap times of sortAscByTwoLoops " + swapTimes);
    }

    @Test
    public void test() {
        int[] array = {12, 1, 5, 20, 2, 1, 4, 8, 3, 29};
        sortAscByTwoLoops(array);
        CommonHelperClass.displayArray(array);
        Assert.assertEquals("1 1 2 3 4 5 8 12 20 29", CommonHelperClass.toStringArray(array));
    }
}
