package com.lienhongvu.designpattern.factorypattern;

import java.math.BigDecimal;

public class TPBank extends Bank {

    @Override
    protected void withdrawMoney(BigDecimal amount) {
        System.out.println(String.format("TPBANK: withdrew %d successfully", amount));
    }
}
