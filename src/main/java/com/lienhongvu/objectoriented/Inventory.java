package com.lienhongvu.objectoriented;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hvlien on 12/25/2018.
 */
public class Inventory {
    private List<Instrument> instrumentList;

    public Inventory() {
        this.instrumentList = new LinkedList<>();
    }

    public void addInstrument(Instrument instrument) {
        instrumentList.add(instrument);
    }

    public List<Instrument> search(InstrumentSpec searchingSpec) {
        List matchedGuitarList = new ArrayList<>();
        instrumentList.forEach(instrument -> {
            if(instrument.getInstrumentSpec().matches(searchingSpec)){
                matchedGuitarList.add(instrument);
            }
        });
        return matchedGuitarList;
    }
}
