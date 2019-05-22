package com.lienhongvu.algorithms.searching;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by hvlien on 11/8/2018.
 */
public class BinarySearching {

    private int[] array = {12, 1, 5, 20, 2, 1, 4, 8, 3, 29};

    @Before
    public void setUp() {
        Arrays.sort(array);
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private boolean binarySearch(int[] array, int searchNumber){
        boolean isFound = false;

        int lowerBound = 0;
        int upperBound = array.length - 1;

        int position;
        while(lowerBound <= upperBound) {
            position = (lowerBound + upperBound) / 2;

            if(array[position] == searchNumber) {
                System.out.println("Searched item at position " + (position + 1));
                isFound = true;
                break;
            } else if(searchNumber > array[position]){
                lowerBound = position + 1;
            } else {
                upperBound = position - 1;
            }
        }

        return isFound;
    }

    @Test
    public void test(){
        assertTrue(binarySearch(array, 1));
        assertTrue(binarySearch(array, 2));
        assertTrue(binarySearch(array, 3));
        assertTrue(binarySearch(array, 4));
        assertTrue(binarySearch(array, 5));
        assertFalse(binarySearch(array, 6));
        assertFalse(binarySearch(array, 7));
        assertTrue(binarySearch(array, 8));
        assertFalse(binarySearch(array, 9));
        assertFalse(binarySearch(array, 10));
        assertTrue(binarySearch(array, 12));
        assertTrue(binarySearch(array, 20));
        assertFalse(binarySearch(array, 21));
        assertTrue(binarySearch(array, 29));
        assertFalse(binarySearch(array, 30));
    }
}
