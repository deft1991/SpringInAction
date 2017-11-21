package ru.deft.Glava4;

import org.springframework.stereotype.Component;
import ru.deft.Glava2.Instrument;


/**
 * Created by s.golitsyn
 */
@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("TIRIAM TIRIAM");
    }
}
