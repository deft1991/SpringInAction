package ru.deft.Glava3;

import ru.deft.Glava2.Instrument;
import ru.deft.Glava2.PerformanceException;
import ru.deft.Glava2.Performer;

/**
 * Created by s.golitsyn
 */

public abstract class InstrumentalList implements Performer{
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public InstrumentalList() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");

    }

    public abstract Instrument getInstrument();

}
