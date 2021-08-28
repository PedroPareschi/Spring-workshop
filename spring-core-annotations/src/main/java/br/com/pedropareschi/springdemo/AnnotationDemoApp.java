package br.com.pedropareschi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
//        Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
//        System.out.println(soccerCoach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        context.close();
    }
}
