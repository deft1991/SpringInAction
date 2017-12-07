package ru.deft.Glava5;

/**
 * Created by s.golitsyn on 21.11.2017
 */

public class Audience {
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }
    public void turnOffCellPhones() { // Перед выступлением
        System.out.println("The audience is turning off their cellphones");
    }
    public void applaud() { // После выступления
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }
}
