package com.lienhongvu.objectoriented;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by hvlien on 12/28/2018.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;
}
