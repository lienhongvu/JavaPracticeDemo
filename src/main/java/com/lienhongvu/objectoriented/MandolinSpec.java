package com.lienhongvu.objectoriented;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hvlien on 12/28/2018.
 */
@Getter
@Setter
public class MandolinSpec extends InstrumentSpec {
    private GuitarConstant.Style style;

    MandolinSpec(String model, GuitarConstant.Builder builder, GuitarConstant.Wood backWood, GuitarConstant.Wood topWood, GuitarConstant.Type type, GuitarConstant.Style style) {
        super(model, builder, backWood, topWood, type);
        this.style = style;
    }

    @Override
    public boolean matches(InstrumentSpec compareInstrument) {
        return compareInstrument instanceof MandolinSpec && super.matches(compareInstrument) && this.style == ((MandolinSpec) compareInstrument).getStyle();
    }
}
