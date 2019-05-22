package com.lienhongvu.bigonotation;

/**
 * Created by hvlien on 10/26/2017.
 * <p>
 * Logarithmic time operation demo O(log n)
 */
public class LogarithmicTime {
    static int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    public static void main(String[] args) {

        int searchNumber = 15;

        int left = 0;
        int right = arrays.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(searchNumber < arrays[mid]){
                right = mid - 1;
            } else if(searchNumber > arrays[mid]){
                left = mid + 1;
            } else {
                System.out.println("Found");
                break;
            }
        }
    }
}
