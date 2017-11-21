package ru.deft.Glava3;

import ru.deft.Glava2.PerformanceException;
import ru.deft.Glava2.Performer;

/**
 * Created by s.golitsyn
 */

public class Magician implements Performer {
    private String magicWords;
    private MagicBox magicBox;
    public Magician() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents());
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }
}
