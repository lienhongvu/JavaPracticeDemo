package com.lienhongvu.designpattern.factorypattern;

public class BankFactory {

    private BankFactory() {
    }

    public static Bank getBank(BankType type) {
        switch (type) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new Vietcombank();
            default:
                throw new IllegalArgumentException("This bank type is not supported");
        }
    }
}
