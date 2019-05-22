package com.lienhongvu.equalandhashcode;

/**
 * Created by hvlien on 1/14/2019.
 */
public class TestSymmetryViolationContract {

    public static void main(String[] args) {
        Money money = new Money(1000, "USD");
        Voucher voucher = new Voucher(1000, "USD", "");

        System.out.println("Money.equals(voucher) == " + money.equals(voucher));
        System.out.println("Voucher.equals(money) == " + voucher.equals(money));

        // Violated Symmetry contract. Should compare two object.getClass instead of instanceof to prevent inheritance comparison
        // Or use composition over inheritance to resolve it
    }
}
