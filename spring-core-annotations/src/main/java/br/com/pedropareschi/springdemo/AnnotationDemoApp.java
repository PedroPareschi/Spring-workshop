package br.com.pedropareschi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(soccerCoach.getDailyWorkout());
        context.close();
    }
}
