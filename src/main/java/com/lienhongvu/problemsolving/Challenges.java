package com.lienhongvu.problemsolving;

/**
 * Created by hvlien on 8/13/2018.
 */
public class Challenges {

    public static void main(String[] args) {
        String[] string1 = new String[]{"a", "b", "c"};
        String[] string2 = new String[]{"d", "e", "c"};

        for(String str1: string1){
            for(String str2: string2){
                if(str2.equals(str1)){
                    System.out.println(str1);
                }
            }
        }


    }
}
