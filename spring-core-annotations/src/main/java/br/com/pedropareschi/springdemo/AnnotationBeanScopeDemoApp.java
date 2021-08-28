package br.com.pedropareschi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach newCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (coach == newCoach);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for coach: " + coach);

        System.out.println("\nMemory location for newCoach: " + newCoach + "\n");

        context.close();

    }
}
