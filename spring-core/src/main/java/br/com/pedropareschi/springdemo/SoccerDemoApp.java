package br.com.pedropareschi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoccerDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("soccer-applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        boolean result = (coach == alphaCoach);

        System.out.println("\n Pointing to the same object: " + result);

        System.out.println("\nMemory location for coach: " + coach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
