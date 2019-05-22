package com.lienhongvu.objectoriented;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hvlien on 12/25/2018.
 */
@Getter
@Setter
class Guitar extends Instrument {

    Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        super(serialNumber, price, guitarSpec);
    }
}
