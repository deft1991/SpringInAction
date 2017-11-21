package ru.deft.Glava2;

/**
 * Created by s.golitsyn
 */

public class Vocalist implements Performer {
    private String song;

    public Vocalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
