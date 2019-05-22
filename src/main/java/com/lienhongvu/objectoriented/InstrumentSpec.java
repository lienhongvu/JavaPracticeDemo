package com.lienhongvu.objectoriented;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Created by hvlien on 12/28/2018.
 */
@Getter
@Setter
@AllArgsConstructor
public class InstrumentSpec {
    private String model;
    private GuitarConstant.Builder builder;
    private GuitarConstant.Wood backWood, topWood;
    private GuitarConstant.Type type;

    public boolean matches(InstrumentSpec compareInstrument){
        if (getBuilder() != compareInstrument.getBuilder())
            return false;

        String searchModel = compareInstrument.getModel() != null ? compareInstrument.getModel().toLowerCase() : null;
        if (Objects.isNull(getModel()) || !getModel().toLowerCase().equals(searchModel))
            return false;

        if (getType() != compareInstrument.getType())
            return false;

        if (getBackWood() != compareInstrument.getBackWood())
            return false;

        if (getTopWood() != compareInstrument.getTopWood())
            return false;

        return true;
    }
}
