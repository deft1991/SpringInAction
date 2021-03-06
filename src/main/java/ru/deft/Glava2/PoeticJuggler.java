package ru.deft.Glava2;

import org.springframework.beans.factory.annotation.Autowired;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    @Autowired
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public PoeticJuggler() {
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
