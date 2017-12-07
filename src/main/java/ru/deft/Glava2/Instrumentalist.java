package ru.deft.Glava2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.deft.Glava4.KeysInstrument;
import ru.deft.Glava4.Strummed;

@Component("eddie")
public class Instrumentalist implements Performer {

//    @Value("q")
    private String song;

    @KeysInstrument
    @Strummed
    private Instrument instrument;


    private Instrument instrumentForInject;

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;

    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
