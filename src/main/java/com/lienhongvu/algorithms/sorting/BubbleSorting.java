package com.lienhongvu.algorithms.sorting;

import com.lienhongvu.utils.CommonHelperClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hvlien on 11/8/2018.
 */
public class BubbleSorting {

    private void sortByDoWhileDesc(int[] array) {
        boolean swapped;
        int timesOfLoop = 0;
        do {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
                timesOfLoop++;
            }
        } while (swapped);
        System.out.println("loop times of sortByDoWhileDesc: " + timesOfLoop);
    }

    private void sortByDoWhileAsc(int[] array) {
        boolean swapped;
        int timesOfLoop = 0;
        do {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
                timesOfLoop++;
            }
        } while (swapped);
        System.out.println("loop times of sortByDoWhileAsc: " + timesOfLoop);
    }

    private void sortByTwoLoopAsc(int[] array) {
        int timesOfLoop = 0, timesOfSwap = 0;
        boolean swapped = false;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                    timesOfSwap++;
                }
                timesOfLoop++;
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("loop times of sortByTwoLoopAsc: " + timesOfLoop);
        System.out.println("swap times of sortByTwoLoopAsc: " + timesOfSwap);
    }

    /*
        BEST METHOD FOR BUBBLE SORTING
     */
    private void sortByTwoLoopDesc(int[] array) {
        int timesOfLoop = 0, timesOfSwap = 0;
        boolean swapped = false;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                    timesOfSwap++;
                }
                timesOfLoop++;
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("loop times of sortByTwoLoopDesc: " + timesOfLoop);
        System.out.println("swap times of sortByTwoLoopAsc: " + timesOfSwap);
    }

    @Test
    public void test() {
        System.out.println("NORMAL CASE: list in random order");
        int[] array1 = {12, 1, 5, 20, 2, 1, 4, 8, 3, 29};
        sortByTwoLoopAsc(array1);
        CommonHelperClass.displayArray(array1);
        Assert.assertEquals("1 1 2 3 4 5 8 12 20 29", CommonHelperClass.toStringArray(array1));

        System.out.println();
        System.out.println("WORST CASE: list in reverse order");
        int[] array3 = {1, 1, 2, 3, 4, 5, 8, 12, 20, 29 };
        sortByTwoLoopDesc(array3);
        CommonHelperClass.displayArray(array3);
        Assert.assertEquals("29 20 12 8 5 4 3 2 1 1", CommonHelperClass.toStringArray(array3));

        System.out.println();
        System.out.println("BEST CASE: list already sorted");
        int[] array4 = {1, 1, 2, 3, 4, 5, 8, 12, 20, 29 };
        sortByTwoLoopAsc(array4);
        CommonHelperClass.displayArray(array4);
        Assert.assertEquals("1 1 2 3 4 5 8 12 20 29", CommonHelperClass.toStringArray(array1));
    }
}
