package com.lienhongvu.algorithms.sorting;

import com.lienhongvu.utils.CommonHelperClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hvlien on 11/13/2018.
 */
public class InsertionSorting {

    private void sortAsc(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    private void sortAscByBook(int[] array) {
        int in;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            in = i;
            while(in > 0 && array[in - 1] > temp){
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }

    @Test
    public void test(){
        int[] array = {12, 1, 5, 20, 2, 1, 4, 8, 3, 29};
        sortAscByBook(array);
        CommonHelperClass.displayArray(array);
        Assert.assertEquals("1 1 2 3 4 5 8 12 20 29", CommonHelperClass.toStringArray(array));
    }
}
