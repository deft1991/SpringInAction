package ru.deft.Glava2;

import java.util.Map;

/**
 * Created by s.golitsyn
 */

public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
