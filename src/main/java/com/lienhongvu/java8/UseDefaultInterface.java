package com.lienhongvu.java8;

import com.lienhongvu.equalandhashcode.Money;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by hvlien on 1/16/2019.
 */
public class UseDefaultInterface implements Interface1, Interface2 {

    private List<Money> list;

    int[] array = {5, 9, 1, 3, 10};

    public void sort(){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void method1(){
        String code = "LIEN";
        list = new ArrayList<>();
        list.add(new Money(1200, "USD"));
        list.forEach(s -> {
            s.setCurrentCode("ascac");
        });
        list.stream().filter(new Predicate<Money>() {
            @Override
            public boolean test(Money money) {
                return money.getCurrentCode().equals(code);
            }
        }).map(new Function<Money, Object>() {
            @Override
            public Object apply(Money money) {
                money.setAmount(1000);
                money.setCurrentCode(code);
                return null;
            }
        });
        list.forEach(money -> System.out.println(money.getCurrentCode()));

        Map a = new HashMap();
        a.keySet().iterator();
//        Collections.synchronizedMap()
    }

    public static void main(String[] args) {
        UseDefaultInterface useDefaultInterface = new UseDefaultInterface();
        useDefaultInterface.display2("a");
        useDefaultInterface.sort();
    }
    @Override
    public void display1() {
    }

    @Override
    public void display3() {

    }
}
