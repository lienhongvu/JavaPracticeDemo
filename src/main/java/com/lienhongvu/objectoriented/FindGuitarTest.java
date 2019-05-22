package com.lienhongvu.objectoriented;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import static com.lienhongvu.objectoriented.GuitarConstant.*;
/**
 * Created by hvlien on 12/25/2018.
 */
public class FindGuitarTest {

    @Test
    public void testFindGuitar() {
        Inventory inventory = initializeInventory();

        GuitarSpec guitarSpec = new GuitarSpec("2018", Builder.FENDER, Wood.ALDER, Wood.ALDER, Type.ACOUSTIC, 5);
        List<Instrument> matchedGuitarList = inventory.search(guitarSpec);

        if (!matchedGuitarList.isEmpty()) {
            System.out.println("Found " + matchedGuitarList.size() + " items");
        } else {
            System.out.println("No item found!");
            Assert.fail();
        }

    }

    private Inventory initializeInventory() {
        Inventory inventory = new Inventory();
        inventory.addInstrument(new Guitar("1", 5000d, new GuitarSpec("2018", Builder.FENDER, Wood.ALDER, Wood.ALDER, Type.ACOUSTIC, 5)));
        inventory.addInstrument(new Mandolin("2", 5000d, new MandolinSpec("2018", Builder.FENDER, Wood.ALDER, Wood.ALDER, Type.ACOUSTIC, Style.A)));
        return inventory;
    }
}
