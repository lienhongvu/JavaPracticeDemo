package com.lienhongvu.objectoriented;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hvlien on 12/25/2018.
 */
@Getter
@Setter
class Mandolin extends Instrument {

    Mandolin(String serialNumber, double price, MandolinSpec mandolinSpec) {
        super(serialNumber, price, mandolinSpec);
    }
}
