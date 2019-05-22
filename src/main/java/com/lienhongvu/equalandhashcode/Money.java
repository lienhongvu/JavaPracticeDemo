package com.lienhongvu.equalandhashcode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by hvlien on 1/14/2019.
 */
@Getter
@Setter
@AllArgsConstructor
public class Money {
    double amount;
    String currentCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Money)) return false;

        Money money = (Money) o;

        if (Double.compare(money.amount, amount) != 0) return false;
        return currentCode != null ? currentCode.equals(money.currentCode) : money.currentCode == null;
    }
}
