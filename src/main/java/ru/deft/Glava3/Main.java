package ru.deft.Glava3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.deft.Glava2.PerformanceException;
import ru.deft.Glava2.Performer;

public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("glava4.xml");
        Performer kenny = (Performer) context.getBean("kenny");
        kenny.perform();
    }
}
