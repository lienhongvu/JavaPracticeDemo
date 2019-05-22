package com.lienhongvu.equalandhashcode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by hvlien on 1/14/2019.
 */
@Getter
@Setter
public class Voucher extends Money {

    private String nameOfVoucher;

    public Voucher(double amount, String currentCode, String nameOfVoucher) {
        super(amount, currentCode);
        this.nameOfVoucher = nameOfVoucher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Voucher)) return false;
        if (!super.equals(o)) return false;

        Voucher voucher = (Voucher) o;

        return nameOfVoucher != null ? nameOfVoucher.equals(voucher.nameOfVoucher) : voucher.nameOfVoucher == null;
    }
}
