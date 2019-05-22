package com.lienhongvu.objectoriented;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hvlien on 12/28/2018.
 */
@Getter
@Setter
public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(String model, GuitarConstant.Builder builder, GuitarConstant.Wood backWood, GuitarConstant.Wood topWood, GuitarConstant.Type type, int numStrings) {
        super(model, builder, backWood, topWood, type);
        this.numStrings = numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec compareInstrument) {
        return compareInstrument instanceof GuitarSpec && super.matches(compareInstrument) && ((GuitarSpec) compareInstrument).getNumStrings() == this.getNumStrings();
    }
}
