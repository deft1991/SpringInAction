package ru.deft.Glava2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");

//        Performer performer1 = (Performer) context.getBean("duke");
//        performer1.perform();
//        Performer performer2 = (Performer) context.getBean("duke-pro");
//        performer2.perform();
//        Performer performer3 = (Performer) context.getBean("poetic-duke");
//        performer3.perform();

        Performer kenny = (Performer) context.getBean("kenny");
        kenny.perform();
//        Performer hank = (Performer) context.getBean("hank");
//        hank.perform();
        Performer carl = (Performer) context.getBean("carl");
        carl.perform();
    }
}
