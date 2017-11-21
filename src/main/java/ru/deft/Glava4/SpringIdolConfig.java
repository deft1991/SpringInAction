package ru.deft.Glava4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.deft.Glava2.Instrumentalist;
import ru.deft.Glava2.Juggler;
import ru.deft.Glava2.Performer;
import ru.deft.Glava2.Poem;
import ru.deft.Glava2.PoeticJuggler;
import ru.deft.Glava2.Sonnet29;

/**
 * Created by s.golitsyn
 */

@Configuration
public class SpringIdolConfig {
    @Bean
    Performer duke() {
        return new Juggler();
    }

    @Bean
    Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    Poem sonnet29(){
        return new Sonnet29();
    }

    public Performer poeticDuke(){
        return new PoeticJuggler(sonnet29());
    }
}
