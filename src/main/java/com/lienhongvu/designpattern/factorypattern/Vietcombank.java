package com.lienhongvu.designpattern.factorypattern;

import java.math.BigDecimal;

public class Vietcombank extends Bank {

    @Override
    protected void withdrawMoney(BigDecimal amount) {
        System.out.println(String.format("VIETCOMBANK: withdrew %d successfully", amount));
    }
}
