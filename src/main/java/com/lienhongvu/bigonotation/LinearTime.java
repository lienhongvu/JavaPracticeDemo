package com.lienhongvu.bigonotation;

/**
 * Created by hvlien on 10/26/2017.
 *
 * Linear time operation demo O(n)
 */
public class LinearTime {

    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    public static void main(String[] args) {
        System.out.println((new LinearTime()).searchSpecifiedNumber(17));
    }

    boolean searchSpecifiedNumber(int searchNum){
        for(int num: numbers){
            if(num == searchNum){
                return true;
            }
        }
        return false;
    }
}
