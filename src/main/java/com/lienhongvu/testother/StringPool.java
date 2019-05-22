package com.lienhongvu.testother;

/**
 * Created by hvlien on 1/11/2019.
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = new String();
        System.out.println("str1 is " + str1.intern());
        System.out.println("str2 is " + str2.intern());
    }
}
