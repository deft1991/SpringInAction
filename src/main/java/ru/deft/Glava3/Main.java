package ru.deft.Glava3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.deft.Glava2.PerformanceException;
import ru.deft.Glava2.Performer;

public class Main {
    public static void main(String[] args) throws PerformanceException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol-glava3.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("glava4.xml");
        Performer kenny = (Performer) context.getBean("kenny");
        kenny.perform();
//        Performer david = (Performer) context.getBean("david");
//        david.perform();
//        Performer frank = (Performer) context.getBean("frank");
//        frank.perform();
//        Performer tailor = (Performer) context.getBean("tailor");
//        tailor.perform();
//        Performer steve = (Performer) context.getBean("steve");
//        steve.perform();
//        Performer harry = (Performer) context.getBean("harry");
//        harry.perform();
//        Performer dgoshua = (Performer) context.getBean("poetic-duke");
//        dgoshua.perform();

    }
}
