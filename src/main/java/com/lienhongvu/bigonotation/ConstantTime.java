package com.lienhongvu.bigonotation;

/**
 * Created by hvlien on 10/26/2017.
 *
 * Constant time operation demo O(1)
 */
public class ConstantTime {

    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    public static void main(String[] args) {
        System.out.println((new ConstantTime()).showLengthOfNumberList());
    }

    private int showLengthOfNumberList(){
        return numbers.length;
    }
}
