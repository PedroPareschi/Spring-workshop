package br.com.pedropareschi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanProcessorDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);

        TennisCoach newCoach = context.getBean("tennisCoach", TennisCoach.class);

        boolean result = (coach == newCoach);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for coach: " + coach);

        System.out.println("\nMemory location for newCoach: " + newCoach + "\n");

        context.close();
    }
}
