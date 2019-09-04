package com.lienhongvu.designpattern.factorypattern;

import java.math.BigDecimal;

public class BankTest {
    public static void main(String[] args) {
        Bank tpbank = BankFactory.getBank(BankType.TPBANK);
        tpbank.withdrawMoney(new BigDecimal(1000000000));

        Bank vietcombank = BankFactory.getBank(BankType.VIETCOMBANK);
        vietcombank.withdrawMoney(new BigDecimal(2000000000));
    }
}
