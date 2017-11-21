package ru.deft.Glava2;

import ru.deft.Glava4.KeysInstrument;
import ru.deft.Glava4.Strummed;

/**
 * Created by s.golitsyn
 */
@KeysInstrument
@Strummed
public class Piano implements Instrument {
    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
